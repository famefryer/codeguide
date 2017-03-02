##Codeguide##
###Avoid Creating a YAGNI (You aren’t going to need it)###
&nbsp;&nbsp;&nbsp;"Write only what you need!!!" I think these message is the best summary of this principles.The good programmer should not add the functionality that did not use.

```
public class PlusMinusNumber {
	private int num1;
	public PlusMinusNumber(int num1){
		this.num1=num1;
	}
	
	public int plus(int num2){
		return num1+num2;
	}
	
	public int Minus(int num2){
		return num1-num2;
	}
	public int Multiple(int num2){
		return num1*num2;
	}
  ```
  &nbsp;&nbsp;&nbsp;You can see in this example.I just want to create a program that can plus and minus the value of the number.but I add the Multiple method 
  that did not use. co-founder Ron Jeffries has written: "Always implement things when you actually need them, never when you just foresee that you need them."<br><br>
Exercise : https://github.com/famefryer/codeguide/blob/master/src/codeguide/CalculatedGrade.java<br>
Reference : https://en.wikipedia.org/wiki/You_aren%27t_gonna_need_it<br><br><br>
## Hide Implementation Details ##
  &nbsp;&nbsp;&nbsp;"Hide Implementation Details" is mean that you set the method that you don't want the user accessed to private.
  ```
  public class PlusMinusNumber {
	private int num1;
	public PlusMinusNumber(int num1){
		this.num1=num1;
	}
	
	public int plus(int num2){
		return num1+num2;
	}
  ```
From the above example You can see one variable name "num1" that I set to private because this program is made for calculating number(plus/minus) then the user should not to access the num1.<br> <>
Exercise : https://github.com/famefryer/codeguide/blob/master/src/codeguide/Cylinder.java<br>
Reference : http://www.artima.com/weblogs/viewpost.jsp?thread=331531


  
