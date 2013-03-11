package my.api

class User {
      String firstName
      String middleInitial
      String lastName
      String email
	  Date dateOfBirth
	  String title

      static constraints = {
      	     firstName(nullable: false, blank: false)
	     middleInitial(nullable: true, blank: false)
	     lastName(nullable: false, blank: false)
	     email(nullable: false, blank: false)
		 dateOfBirth(nullable: false)
		 title()
      }
}
