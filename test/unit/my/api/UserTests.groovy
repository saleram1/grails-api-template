package my.api



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(User)
class UserTests {

      void setUp() {}

    void testUserShouldRequireFirstAndLastNamesNotMiddle() {
       User aUser = new User(firstName: "Joe", email: "joe.bloggs@gmail.com")
       assertFalse aUser.validate()
       assertNull aUser.lastName				
    }

    void testUserWithFullNameShouldSave() {
       User aUser = new User(firstName: "Joe", lastName: "Bloggs", email: "joe.bloggs@gmail.com")
       assertTrue aUser.validate()
    }

    void testUserWithValidEmailShouldSave() {
       User aUser = new User(firstName: "Joe", lastName: "Bloggs", email: "joe.bloggs@gmail.com")
       assertTrue aUser.validate()
       assertNotNull aUser.save()
    }
}
