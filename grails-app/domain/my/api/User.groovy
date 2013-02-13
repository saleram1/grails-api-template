package my.api

class User {
      String firstName
      String middleInitial
      String lastName
      String email

      static constraints = {
      	     firstName()
	     middleInitial(nullable: true, blank: false)
	     lastName()
	     email(email: true, blank: false) 	   
      }
}
