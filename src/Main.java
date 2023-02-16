import model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t ----------------------- PAAT Hospital ------------------------ ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    बिग्रिन्छ जब तिम्रो शरीरको ताल, उपचारको लागि बेस्ट पात अस्पताल             ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t -------------------------------------------------------------- ");
        System.out.println();

        System.out.println("Features: ");
        System.out.println("1. Efficient registration and appointments");
        System.out.println("2. Multiple departmental facilities");
        System.out.println("3. Quick and accurate billing system");
        System.out.println();


        Department department = new Department();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Do you want to enter this hospital management?");
        System.out.println("\t\t --> Press 1 to enter");
        System.out.println("\t\t --> Press any other number to leave");
        int yes = scanner1.nextInt();
        if (yes == 1) {
            System.out.println();
            System.out.println("Are you already registered or do you want to register?");
            System.out.println("\t\t --> Press OP to see if you are already registered or not");
            System.out.println("\t\t --> Press NP to register into our system");
            Scanner scanner2 = new Scanner(System.in);
            String registration = scanner2.nextLine();

            if (registration.equalsIgnoreCase("OP")) {
                ArrayList<OldPatients> oldPatients = new ArrayList<>();
                OldPatients o1 = new OldPatients(1, "Aryan Thagunna", "Kapan", "9876543211", "01/19/2023", "Male");
                oldPatients.add(o1);
                OldPatients o2 = new OldPatients(2, "Sabin Shrestha", "Maitidevi", "9867564532", "12/18/2022", "Male");
                oldPatients.add(o2);
                OldPatients o3 = new OldPatients(3, "DipRaj Bahak", "Sifal", "9854327689", "01/19/2023", "Female");
                oldPatients.add(o3);
                OldPatients o4 = new OldPatients(4, "Pranil Prasai", "Sifal", "9832456789", "02/04/2023", "Male");
                oldPatients.add(o4);
                OldPatients o5 = new OldPatients(5, "Aarasee Shrestha", "Lagankhel", "9867895643", "10/11/2022", "Female");
                oldPatients.add(o5);

                System.out.println("--------------------------------- Registered Patients -------------------------------------- ");
                System.out.println("ID\t\t" + "Name\t\t" + "Address\t\t" + "Phone Number\t\t" + "Registration Date\t\t" + "Gender");
                for (OldPatients patient : oldPatients) {
                    int id = patient.getId();
                    String name = patient.getName();
                    String address = patient.getAddress();
                    String phoneNumber = patient.getPhone_number();
                    String date = patient.getRegistered_date();
                    String gender = patient.getGender();

                    System.out.println(id + "\t\t" + name + "\t\t" + address + "\t\t" + phoneNumber + "\t\t" + date + "\t\t" + gender);
                }
                System.out.println("--------------------------------------------------------------------------------------------- ");
            }

            if (registration.equalsIgnoreCase("NP")) {

                Scanner scanner3 = new Scanner(System.in);
                System.out.println("Id:");
                int id = scanner3.nextInt();

                System.out.println("Name:");
                String p_name = scanner3.next();

                System.out.println("Address:");
                String address = scanner3.next();

                System.out.println("Phone number:");
                String phoneNumber = scanner3.next();

                System.out.println("Gender:");
                String gender = scanner3.next();

                System.out.println("Registered Date: ");
                String registeredDate = scanner3.next();

                double registrationAmount = 500;

                System.out.println();
                System.out.println("------------------------------- Your Information: -----------------------------------");
                System.out.println("\t\t ID: " + id);
                System.out.println("\t\t Name: " + p_name);
                System.out.println("\t\t Address: " + address);
                System.out.println("\t\t Phone Number: " + phoneNumber);
                System.out.println("\t\t Gender: " + gender);
                System.out.println("\t\t Registration Date: " + registeredDate);
                System.out.println("\t\t\t\t\t\t Your  Registration Amount: " + registrationAmount);
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println();

                System.out.println("Which department would you like to go for treatment?? ");
                System.out.println();
                department.getDepartments();
                System.out.println();
                System.out.println("Press the respective key to reach departments: ");
                System.out.println("\t\t --> Please add the respective department charges to your account");
                Scanner scanner4 = new Scanner(System.in);
                String department_answer = scanner4.nextLine();

                if (department_answer.equalsIgnoreCase("1")) {
                    double pharmacy_department_charge = 700;
                    department.Pharmacy(700);
                    System.out.println();

                    System.out.println("\t\t\t\t\t\t Department Doctors: ");
                    ArrayList<Doctor> PharmacyDoctors = new ArrayList<>();
                    Doctor p1 = new Doctor("Rahul Sharma", "Drug Prescription", "3 years", true);
                    PharmacyDoctors.add(p1);
                    Doctor p2 = new Doctor("Sandeep Bajgain", "Synax Medication", "4 years", true);
                    PharmacyDoctors.add(p2);

                    System.out.println("\t\t\t\t\t\t\t\t\t\t Name \t\t" + "Speciality \t\t" + "Experience\t\t " + "Availability");
                    for (Doctor pd : PharmacyDoctors) {
                        String name = pd.getName();
                        String speciality = pd.getSpeciality();
                        String yop = pd.getYears_of_experience();
                        String availability = String.valueOf(pd.isAvailability());

                        System.out.println("\t\t\t\t\t\t\t\t" + name + "\t\t" + speciality + "\t\t" + yop + "\t\t" + availability);
                    }
                    System.out.println("\t\t\t\t ------------------------------------------------------------------------------------------ ");
                    System.out.println();
                    System.out.println("------------------------------------  Bill -----------------------------------------------");
                    System.out.println("\t\t ID: " + id);
                    System.out.println("\t\t Name: " + p_name);
                    System.out.println("\t\t Address: " + address);
                    System.out.println("\t\t Phone Number: " + phoneNumber);
                    System.out.println("\t\t Gender: " + gender);
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\tTotal  Bill: " + (registrationAmount + pharmacy_department_charge));
                    System.out.println("---------------------------------------------------------------------------------------------------");
                    }

                if (department_answer.equalsIgnoreCase("2")) {
                    double surgery_department_charge = 800;
                    department.Surgery(800);

                    System.out.println();
                    System.out.println("\t\t\t\t\t\t Department Doctors: ");
                    ArrayList<Doctor> SurgeryDoctors = new ArrayList<>();
                    Doctor s1 = new Doctor("Deepika Chaulagain", "Open Surgery", "5 years", false);
                    SurgeryDoctors.add(s1);
                    Doctor s2 = new Doctor("Hari Tamang", "Heart Surgery", "7 years", true);
                    SurgeryDoctors.add(s2);
                    Doctor s3 = new Doctor("Sandeep Gautam", "Endoscopic Surgery", "10 years", true);
                    SurgeryDoctors.add(s3);
                    Doctor s4 = new Doctor("Bibek Guragain", "Robotic Surgery", "6 years", false);
                    SurgeryDoctors.add(s4);


                    System.out.println("\t\t\t\t\t\t\t\t\t\t Name \t\t" + "Speciality \t\t" + "Experience\t\t " + "Availability");
                    for (Doctor sd : SurgeryDoctors) {
                        String name = sd.getName();
                        String speciality = sd.getSpeciality();
                        String yop = sd.getYears_of_experience();
                        String availability = String.valueOf(sd.isAvailability());

                        System.out.println("\t\t\t\t\t\t\t\t" + name + "\t\t" + speciality + "\t\t" + yop + "\t\t" + availability);
                    }

                    System.out.println();
                    System.out.println("\t\t\t\t\t\t Department Wards: ");
                    ArrayList<Ward> SurgeryWards = new ArrayList<>();
                    Ward w1 = new Ward(3, true, "02/15/2023");
                    SurgeryWards.add(w1);
                    Ward w2 = new Ward(4, false, "02/16/2023");
                    SurgeryWards.add(w2);

                    System.out.println("\t\t\t\t\t Num of Beds \t\t\t" + "Availability \t\t" +   " Date\t\t");
                    for(Ward wd : SurgeryWards) {
                        String numofBeds = String.valueOf(wd.getNumofBeds());
                        boolean availability = wd.isAvailabilty();
                        String date = wd.getDateofLastInspection();

                        System.out.println("\t\t\t\t\t\t\t\t" + numofBeds + "\t\t" + availability + "\t\t" + date);
                    }
                    System.out.println("\t\t\t\t --------------------------------------------------------------------------------------- ");
                    System.out.println();
                    System.out.println("------------------------------------  Bill -----------------------------------------------");
                    System.out.println("\t\t ID: " + id);
                    System.out.println("\t\t Name: " + p_name);
                    System.out.println("\t\t Address: " + address);
                    System.out.println("\t\t Phone Number: " + phoneNumber);
                    System.out.println("\t\t Gender: " + gender);
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\tTotal  Bill: " + (registrationAmount + surgery_department_charge));
                    System.out.println("---------------------------------------------------------------------------------------------------");
            }

                if (department_answer.equalsIgnoreCase("3")) {
                    double cardiology_department_charge = 900;
                    department.Cardiology(900);

                    System.out.println();
                    System.out.println("\t\t\t\t\t\t Department Doctors: ");
                    ArrayList<Doctor> CardiologyDoctors = new ArrayList<>();
                    Doctor c1 = new Doctor("Sakshi Khatiwada", "Clinical settings", "2 years", true);
                    CardiologyDoctors.add(c1);
                    Doctor c2 = new Doctor("Sangeeta KC", "Diagnostics", "5 years", true);
                    CardiologyDoctors.add(c2);
                    Doctor c3 = new Doctor("Prajjwal Khanal", "Holter Monitoring", "10 years", true);
                    CardiologyDoctors.add(c3);


                    System.out.println("\t\t\t\t\t\t\t\t\t\t Name \t\t" + "Speciality \t\t" + "Experience\t\t " + "Availability");
                    for (Doctor cd : CardiologyDoctors) {
                        String name = cd.getName();
                        String speciality = cd.getSpeciality();
                        String yop = cd.getYears_of_experience();
                        String availability = String.valueOf(cd.isAvailability());

                        System.out.println("\t\t\t\t\t\t\t\t" + name + "\t\t" + speciality + "\t\t" + yop + "\t\t" + availability);
                    }

                    System.out.println();
                    System.out.println("\t\t\t\t\t\t Department Wards: ");
                    ArrayList<Ward> CardiologyWards = new ArrayList<>();
                    Ward cw1 = new Ward(4, false, "02/15/2023");
                    CardiologyWards.add(cw1);
                    Ward cw2 = new Ward(4, true, "02/16/2023");
                    CardiologyWards.add(cw2);

                    System.out.println("\t\t\t\t\t Num of Beds \t\t\t" + "Availability \t\t" +   " Date\t\t");
                    for(Ward wd : CardiologyWards) {
                        String numofBeds = String.valueOf(wd.getNumofBeds());
                        boolean availability = wd.isAvailabilty();
                        String date = wd.getDateofLastInspection();

                        System.out.println("\t\t\t\t\t\t\t\t" + numofBeds + "\t\t" + availability + "\t\t" + date);
                    }
                    System.out.println("\t\t\t\t --------------------------------------------------------------------------------------- ");
                    System.out.println();
                    System.out.println("------------------------------------  Bill -----------------------------------------------");
                    System.out.println("\t\t ID: " + id);
                    System.out.println("\t\t Name: " + p_name);
                    System.out.println("\t\t Address: " + address);
                    System.out.println("\t\t Phone Number: " + phoneNumber);
                    System.out.println("\t\t Gender: " + gender);
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\tTotal  Bill: " + (registrationAmount + cardiology_department_charge));
                    System.out.println("---------------------------------------------------------------------------------------------------");
                }

                if (department_answer.equalsIgnoreCase("4")) {
                    double pathology_department_charge = 690;
                    department.Pathology(690);

                    System.out.println();
                    System.out.println("\t\t\t\t\t\t Department Doctors: ");
                    ArrayList<Doctor> PathologyDoctors = new ArrayList<>();
                    Doctor p1 = new Doctor("Rajendra Koirala ", "Blood Tests", "1 year", true);
                    PathologyDoctors.add(p1);
                    Doctor p2 = new Doctor("Lekhnath Yadav", "Tissue Analysis", "2 years", true);
                    PathologyDoctors.add(p2);
                    Doctor p3 = new Doctor("Suraj Khanal", "Clinical Trials", "3 years", false);
                    PathologyDoctors.add(p3);


                    System.out.println("\t\t\t\t\t\t\t\t\t\t Name \t\t" + "Speciality \t\t" + "Experience\t\t " + "Availability");
                    for (Doctor pdd : PathologyDoctors) {
                        String name = pdd.getName();
                        String speciality = pdd.getSpeciality();
                        String yop = pdd.getYears_of_experience();
                        String availability = String.valueOf(pdd.isAvailability());

                        System.out.println("\t\t\t\t\t\t\t\t" + name + "\t\t" + speciality + "\t\t" + yop + "\t\t" + availability);
                    }

                    System.out.println();
                    System.out.println("\t\t\t\t\t\t Department Wards: ");
                    ArrayList<Ward> PathologyWards = new ArrayList<>();
                    Ward pw1 = new Ward(3, false, "02/15/2023");
                    PathologyWards.add(pw1);
                    Ward pw2 = new Ward(1, true, "02/10/2023");
                    PathologyWards.add(pw2);
                    Ward pw3 = new Ward(2, true, "02/11/2023");
                    PathologyWards.add(pw3);
                    Ward pw4 = new Ward(4, true, "02/12/2023");
                    PathologyWards.add(pw4);

                    System.out.println("\t\t\t\t\t Num of Beds \t\t\t" + "Availability \t\t" +   " Date\t\t");
                    for(Ward wd : PathologyWards) {
                        String numofBeds = String.valueOf(wd.getNumofBeds());
                        boolean availability = wd.isAvailabilty();
                        String date = wd.getDateofLastInspection();

                        System.out.println("\t\t\t\t\t\t\t\t" + numofBeds + "\t\t" + availability + "\t\t" + date);
                    }
                    System.out.println("\t\t\t\t --------------------------------------------------------------------------------------- ");

                    System.out.println("\t\t\t\t\t Available Tests: ");
                    ArrayList<Tests> PathologyTests = new ArrayList<>();
                    Tests t1 = new Tests(1,"Blood Test", 600.90);
                    PathologyTests.add(t1);
                    Tests t2 = new Tests(2,"Tissue Test", 700.90);
                    PathologyTests.add(t2);

                    double blood_Test_amount = 600.90;
                    double tissue_Test_amount = 700.90;

                    System.out.println("\t\t\t\t\t ID " + "Test Type" + "\t\t" + "Amount");
                    for(Tests pt: PathologyTests) {
                        int test_id = pt.getId();
                        String test_type = pt.getTest_type();
                        double amount = pt.getAmount();

                        System.out.println("\t\t\t\t" + test_id + "\t\t" + test_type+ "\t\t" + amount);
                    }
                    System.out.println("Press the respective keys to do particular tests: ");
                    Scanner scanner5 = new Scanner(System.in);
                    String testdone = scanner5.nextLine();
                    if(testdone.equalsIgnoreCase("1")) {
                        System.out.println("\t\t\t\t --------------------------------------------------------------------------------------- ");
                        System.out.println();
                        System.out.println("------------------------------------  Bill -----------------------------------------------");
                        System.out.println("\t\t ID: " + id);
                        System.out.println("\t\t Name: " + p_name);
                        System.out.println("\t\t Address: " + address);
                        System.out.println("\t\t Phone Number: " + phoneNumber);
                        System.out.println("\t\t Gender: " + gender);
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\tTotal  Bill: " + (registrationAmount + pathology_department_charge + blood_Test_amount));
                        System.out.println("---------------------------------------------------------------------------------------------------");
                    }
                    if (testdone.equalsIgnoreCase("2")) {
                        System.out.println("\t\t\t\t --------------------------------------------------------------------------------------- ");
                        System.out.println();
                        System.out.println("------------------------------------  Bill -----------------------------------------------");
                        System.out.println("\t\t ID: " + id);
                        System.out.println("\t\t Name: " + p_name);
                        System.out.println("\t\t Address: " + address);
                        System.out.println("\t\t Phone Number: " + phoneNumber);
                        System.out.println("\t\t Gender: " + gender);
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\tTotal  Bill: " + (registrationAmount + pathology_department_charge + tissue_Test_amount));
                        System.out.println("---------------------------------------------------------------------------------------------------");
                    }

                }

                System.out.println();

            }

        } else {
            System.out.println("Sorry to see you leave. Be healthy!!!");
        }
    }
}

