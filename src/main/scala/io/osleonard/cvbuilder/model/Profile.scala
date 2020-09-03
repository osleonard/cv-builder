package io.osleonard.cvbuilder.model

final case class Profile(
  contact: Contact,
  work: List[workExperience],
  skills: List[Skills],
  education: List[Education]
)

final case class Contact(
  name: String,
  email: String,
  page: String,
  github: String,
  twitter: String,
  stackoverflow: String
)

final case class workExperience(
  employer: String,
  title: String,
  location: String,
  dates: String,
  description: List[String]
)

final case class Skills(
  name: String,
  skills: List[String]
)

final case class Education(
  degree: String,
  name: String,
  dates: Int
)

