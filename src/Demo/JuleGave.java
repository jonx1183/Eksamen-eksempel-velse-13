package Demo;

import java.util.Random;

public class JuleGave {

  private boolean isSoft;
  private boolean isRectangular;
  private boolean doesRattle;
  Random rnd = new Random();


  public static void main(String[] args) {
    JuleGave main = new JuleGave();

    main.go();
  }

  public void go(){

    System.out.println(couldBeLego());


  }

  JuleGave(){
    isSoft = rnd.nextBoolean();
    isRectangular = rnd.nextBoolean();
    doesRattle = rnd.nextBoolean();
  }

  public boolean couldBeLego(){
    JuleGave gave1 = new JuleGave();
    if(gave1.isSoft == true && gave1.isRectangular == true && gave1.doesRattle == true){
      return true;
    }
    else
      return false;
  }

 /*
  public boolean getIsSoft(){
    return isSoft;
  }

  public boolean getIsRectangular(){
    return isRectangular;
  }

  public boolean getDoesRattle(){
    return doesRattle;
  }

  */
}
