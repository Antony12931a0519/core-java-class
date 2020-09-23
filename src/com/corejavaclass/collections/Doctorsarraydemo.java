package com.corejavaclass.collections;

import com.corejavaclass.datatypes.Doctor;

public class Doctorsarraydemo {

	public static void main(String[] args) {

		Doctor[] doctors = new Doctor[10];

		Doctor doctor = new Doctor();
		doctor.setAddress("wekfenqa");
		doctor.setAge(123);
		doctor.setName("jwgnwe");
		doctors[0] = doctor;

		Doctor doctor1 = new Doctor();
		doctor1.setAddress("wekfenqa");
		doctor1.setAge(123);
		doctor1.setName("jwgnwe");
		doctors[1] = doctor1;

		
		for(int i=0; i<=doctors.length-1;i++){
			System.out.println(doctors[i]);
		}
		
		// System.out.println(doctor1);

	}

}
