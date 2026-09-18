import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class LoginTest {
@Test
public void testCheckUserName() {
Login user = new Login(
"John",
"Smith",
"kyl_1",
"Ch&&sec@ke99!",
"+27838968976"
);
assertTrue(user.checkUserName());
}
@Test
public void testCheckUserNameIncorrect() {
Login user = new Login(
"John",
"Smith",
"kyle!!!!!!!",
"Ch&&sec@ke99!",
"+27838968976"
);
assertFalse(user.checkUserName());
}
@Test
public void testCheckPasswordComplexity() {
Login user = new Login(
"John",
"Smith",
"kyl_1",
"Ch&&sec@ke99!",
"+27838968976"
);
assertTrue(user.checkPasswordComplexity());
}
@Test
public void 
testCheckPasswordComplexityIncorrect() {
Login user = new Login(
"John",
"Smith",
"kyl_1",
"password",
"+27838968976"
);
assertFalse(user.checkPasswordComplexity());
}
@Test
public void testCheckCellPhoneNumber() {
Login user = new Login(
"John",
"Smith",
"kyl_1",
"Ch&&sec@ke99!",
"+27838968976"
);
assertTrue(user.checkCellPhoneNumber());
}
@Test
public void 
testCheckCellPhoneNumberIncorrect() {
Login user = new Login(
"John",
"Smith",
"kyl_1",
"Ch&&sec@ke99!",
"08966553"
);
assertFalse(user.checkCellPhoneNumber());
}
@Test
public void testRegisterUserSuccess() {
Login user = new Login(
"John",
"Smith",
"kyl_1",
"Ch&&sec@ke99!",
"+27838968976"
);
assertEquals(
"User registered successfully.",
user.registerUser()
);
}
@Test
public void 
testRegisterUserIncorrectUsername() {
Login user = new Login(
"John",
"Smith",
"kyle!!!!!!!",
"Ch&&sec@ke99!",
"+27838968976"
);
assertEquals(
"Username is not correctly formatted; please ensure that your username contains an underscore and is more than five characters in length.",
        user.registerUser()
);
}
@Test
public void testRegisterUserIncorrectPassword() 
{
Login user = new Login(
"John",
"Smith",
"kyl_1",
"password",
"+27838968976"
);
assertEquals(
"Password is not correctly formatted; please ensure that your password contains at least eight characters, a capital letter, a number and a special character.",
        user.registerUser()
);
}
@Test
public void testLoginSuccessful() {
Login user = new Login(
"John",
"Smith",
"kyl_1",
"Ch&&sec@ke99!",
"+27838968976"
);
assertTrue(user.loginUser("kyl_1", 
"Ch&&sec@ke99!"));
}
@Test
public void testLoginFailed() {
Login user = new Login(
"John",
"Smith",
"kyl_1",
"Ch&&sec@ke99!",
"+27838968976"
);
assertFalse(user.loginUser("wrong", "wrong"));
}
@Test
public void testReturnLoginStatusSuccessful() {
Login user = new Login(
"John",
"Smith",
"kyl_1",
"Ch&&sec@ke99!",
"+27838968976"
);

assertEquals("Welcome John Smith, it is great to see you again.",
        user.returnLoginStatus(true));

}
@Test
public void testReturnLoginStatusFailed() {
Login user = new Login(
"John",
"Smith",
"kyl_1",
"Ch&&sec@ke99!",
"+27838968976"
);
assertEquals(
"Username or password incorrect, please try again.",
user.returnLoginStatus(false)
);
}
}