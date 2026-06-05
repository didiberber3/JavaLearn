package com.jl.enum_;

public class EnumDetail {
	public static void main(String[] args) {

		Music.CLASSICMUSIC.play();
	}
}

class A {

}

//enum不能继承其他类,因为隐式继承Enum,而java是单继承机制
enum Season4 /*不能添加extends继承类*/ {

}

interface IPlaying {
	void play();
}

enum Music implements IPlaying {
	CLASSICMUSIC;

	@Override
	public void play() {
		System.out.println("播放好听的音乐.");
	}
}