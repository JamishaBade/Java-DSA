package OOP.abstraction;

abstract class animal {
  // abstraction= hiding unnecessary details adn showing only essential features

  public void walk() {
  } // this is unnessary because we dont create instances of animal i general so we
    // make it abstract.

}

class horse extends animal {
  public void walk() {
    System.out.println("walks on 4 legs");
  }
}

class chicken extends animal {
  public void walk() {
    System.out.println("walks on 2 legs");
  }
}
