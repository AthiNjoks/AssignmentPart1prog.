/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thokozile
 */
public class Login {

  private String firstName;
  private String lastName;
  private String userName;
  private String password;
  private final String cellphoneNumber;
    
    // constructor
  public Login(String firstName, String lastName,String username, String password, String cellPhoneNumber){
      this.firstName = firstName;
      this.lastName = lastName;
      this.userName = username;
      this.password = password;
      this.cellphoneNumber = cellPhoneNumber;
    } 

  // Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
     // 1 check username
      public boolean checkUserName() {     
        return userName.contains("_") && userName.length() <= 5;
  }
     //2. Check password complexity
      public boolean checkPasswordComplexity () {
          return password.length() >= 8
                  && password.matches(".*[A-Z].*")
                  && password.matches(".*[0-9].*")
                  && password.matches(".*[^a-zA-Z0-9].*");
      }
      //3. Check cell phone number    
          public boolean checkCellPhoneNumber(){
              return cellphoneNumber.startsWith("+")
                        &&
                     cellphoneNumber.length() <= 13;
                      
          }
      //4 Register user        
         public String registerUser(){
              if (!checkUserName()) {
                  return "Username is not correctly formatted; please ensure that your username contains an underscore and is more than five characters in length.";
              }    
               
              if (!checkPasswordComplexity()){
                  return "Password is not correctly formatted; please ensure that your password contains at least eight characters, a capital letter, a number and a special character.";
                  
              
              
               }
                  return "User registered successfully.";
              
              }
          
              //5. login user
          public boolean loginUser(String enteredUsername, String enteredPassword) {
              return enteredUsername.equals(userName)
                      && enteredPassword.equals(password);
             }
              //6.Retun login status
              public String returnLoginStatus(boolean loginStatus) {
                  if (loginStatus) {
                      return "Welcome " + firstName + " " + lastName + ", it is great to see you again.";
                  }else{
                      return "Username or password incorrect, please try again.";            
                  }
              }
              
}
          
          
          
              
      

    

