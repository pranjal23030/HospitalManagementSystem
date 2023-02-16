package model;

public class Department {
        String d1 = "Pharmacy";
        String d2 = "Surgery";
        String d3 = "Cardiology";
        String d4 = "Pathology";

    public void getDepartments(){
            System.out.println("----------------------------------------------------------------");
            System.out.println("\t\t\t\t\t Available Departments: ");
            System.out.println("\t\t\t\t\t\t 1." + d1);
            System.out.println("\t\t\t\t\t\t 2." + d2);
            System.out.println("\t\t\t\t\t\t 3." + d3);
            System.out.println("\t\t\t\t\t\t 4." + d4);
            System.out.println("----------------------------------------------------------------");
    }

    public void Pharmacy(Integer department_charge) {
            System.out.println("\t\t\t\t ---------------------------Welcome to Pharmacy Department -------------------------- ");
            System.out.println("\t\t\t\t\t\t Department head: Pranjal Khatiwada");
            System.out.println();
            System.out.println("\t\t\t\t\t\t Department Services: ");
            System.out.println("\t\t\t\t\t\t -->Providing prescription medications, over-the-counter drugs, medical supplies, and other health-related products. ");
            System.out.println();
            System.out.println("\t\t\t\t\t\t Department Charge: " + department_charge );
    }

    public void Surgery(Integer department_charge) {
        System.out.println("\t\t\t\t ---------------------------Welcome to Surgery Department -------------------------- ");
        System.out.println("\t\t\t\t\t\t Department head: Arunesh Manandhar");
        System.out.println();
        System.out.println("\t\t\t\t\t\t Department Services: ");
        System.out.println("\t\t\t\t\t\t --> Highly skilled medical professionals who specialize in a wide range of minimally invasive, laparoscopic, and robotic-assisted procedures.  ");
        System.out.println("\t\t\t\t\t\t --> Highest quality care and to ensure that our patients receive the best possible outcome.");
        System.out.println();
        System.out.println("\t\t\t\t\t\t Department Charge: " + department_charge );
    }

    public void Cardiology(Integer department_charge) {
        System.out.println("\t\t\t\t ---------------------------Welcome to Cardiology Department -------------------------- ");
        System.out.println("\t\t\t\t\t\t Department head: Aswin Siwakoti");
        System.out.println();
        System.out.println("\t\t\t\t\t\t Department Services: ");
        System.out.println("\t\t\t\t\t\t -->  A number of specialized services to patients suffering from heart-related illnesses. ");
        System.out.println("\t\t\t\t\t\t -->  We also offer many other treatments, such as pacemakers to regulate the heartbeat, angioplasty and stenting to widen blocked arteries and veins, and cardiac catheterization to diagnose and treat conditions like heart valve abnormalities.");
        System.out.println("\t\t\t\t\t\t -->  Echocardiograms to produce images of the heart and its motion, and Holter monitors to evaluate the heart rate over a certain period of time.");
        System.out.println();
        System.out.println("\t\t\t\t\t\t Department Charge: " + department_charge );
    }

    public void Pathology(double department_charge) {
        System.out.println("\t\t\t\t ---------------------------Welcome to Pathology Department -------------------------- ");
        System.out.println("\t\t\t\t\t\t Department head: Tatsam Gautam");
        System.out.println();
        System.out.println("\t\t\t\t\t\t Department Services: ");
        System.out.println("\t\t\t\t\t\t -->  Blood tests – analyzing samples of blood to detect the presence of disease, infection and other medical issues. ");
        System.out.println("\t\t\t\t\t\t -->  Tissue analysis – examining samples of tissue under a microscope to identify the presence of cancer. ");
        System.out.println("\t\t\t\t\t\t -->  Clinical trials – conducting studies to test the effectiveness of treatments and medications. ");
        System.out.println();
        System.out.println("\t\t\t\t\t\t Department Charge: " + department_charge );
    }
}

