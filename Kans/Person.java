package Kans;

import Kans.Serializable;


public class Person extends Serializable {
    String name;
    int age;
    float weight;
    double height;
    static int pid;
    transient int adha;

}
