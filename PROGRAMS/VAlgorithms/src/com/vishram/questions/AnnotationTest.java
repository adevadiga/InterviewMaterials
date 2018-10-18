package com.vishram.questions;

class Soccer{
	public void play(){
		
	}
}
class FootBall extends Soccer{
	@Override
	public void play(int i){
		
	}
}
public class AnnotationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        FootBall f = new FootBall();
        f.play(1);
	}

}
