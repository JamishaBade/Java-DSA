package OOP.acessModifiers;

class Account {
  public String name;
  protected String gmail;
  private String password;

  // Way to access private variables=> getter and setters
  public String getPassword() {
    return this.password;
  }

  public void setPassword(String pass) {
    this.password = pass;
  }

}

public class bank {
  public static void main(String args[]) {

    Account acc1 = new Account();
    acc1.name = "JamishaB";
    acc1.gmail = "badejamisha@gmail.com";
    // acc1.password="ljwflkaj"; this creates error
    acc1.setPassword("abcdjfls");
    String password = acc1.getPassword();
    System.out.println("This password is " + password);
  }

}
