package io.osleonard.cvbuilder

import java.io.InputStreamReader

import scala.io.Source
import scala.util.{ Failure, Success, Try }
import io.circe._
import io.circe.generic.auto._
import io.circe.yaml.parser
import io.osleonard.cvbuilder.model.{ Contact, Profile }

object CVBuilder extends App {

  // TODO  Gen output to either md, html, pdf
  readYamlFile("resume.yaml") match {
    case Failure(exception) =>
      println("Yawa don gas", exception)
    case Success(value) =>
      parser.parse(value) match {
        case Left(parseException) =>
          println("There was a problem parsing the yaml", parseException.message)
        case Right(value) =>
          println(value.as[Profile])
      }

  }

  def readYamlFile(resourcesPath: String): Try[InputStreamReader] =
    Try(Source.fromResource(resourcesPath).reader())
}
