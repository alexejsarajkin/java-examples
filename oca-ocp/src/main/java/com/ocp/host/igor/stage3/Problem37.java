package com.ocp.host.igor.stage3;

public class Problem37 {
}

interface Answerable {
    public void answer(String question);
}

abstract class Test implements Answerable {
    public void write(String essay) {
    }
}

// abstract class Exam implements Answerable {
//	public abstract void answer(String str) { }
//	public void faint(Boolean bool) { }
//}
//
// class Quiz implements Answerable {
//	public void answer(Integer num) { }
//}
//
// class BlindDate implements Answerable {
//	public void answer(Integer age) { }
//	public String grin(Integer numberOfMissingTeeth) { }
//}
class Interrogation implements Answerable {
    public void answer(String nameAndRank) {
    }

    public void answer(Integer serialNumber) {
    }

    public void refuse(String otherQuestions) {
    }
}