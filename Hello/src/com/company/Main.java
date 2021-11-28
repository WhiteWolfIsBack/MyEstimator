package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       choice();
    }

    static void choice() {

        Scanner in = new Scanner(System.in);
        System.out.println("1 for Interest calc");
        System.out.println("2 for EMI Deduction");
        System.out.print("Enter Your Number : ");
        int a = in.nextInt();

        if (a == 1) {
            Interest();
        } else if (a == 2) {
            EMI_deduction();
        }else {
            Interest();
            EMI_deduction();
        }

    }

    static void Interest(){

        System.out.println("INTEREST CALCULATOR : ");
        System.out.println("======================");
        Scanner in = new Scanner(System.in);
        float Amount;
        float Interest;
        System.out.print("Please enter Your Principle in INR            : ");
        Amount = in.nextInt();
        System.out.print("Please enter Your Interest in Percent         : ");
        Interest = in.nextFloat();
        float temp = Amount * Interest / 100;
        System.out.println("Your Interest Per Month in RS is              : " + temp + " RS");
        System.out.println("==============================================================================");

    }

    static void EMI_deduction() {

        System.out.println("EMI CALCULATOR : ");
        System.out.println("===================");



        // Input and Variable Store
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Total Income                       : ");
        float TotalIncome = in.nextInt();
        System.out.print("Enter Your First Personal EMI                 : ");
        float FirstPersonalEmi = in.nextInt();
        System.out.print("Enter Your Second Personal EMI                : ");
        float SecondPersonalEMI = in.nextInt();
        System.out.print("Enter Your Home Loan EMI                      : ");
        float HomeLoanEMI = in.nextInt();
        System.out.print("Enter Your Four Wheeler EMI (1)               : ");
        float FourWheelerOneEMI = in.nextInt();
        System.out.print("Enter Your Four Wheeler EMI (2)               : ");
        float FourWheelerTwoEMI = in.nextInt();
        System.out.print("Enter Your Four Wheeler EMI (3)               : ");
        float FourWheelerThreeEMI = in.nextInt();
        System.out.print("Enter Your Four Wheeler EMI (4)               : ");
        float FourWheelerFourEMI = in.nextInt();
        System.out.print("Enter Your Four Wheeler EMI (1)               : ");
        float TwoWheelerOneEMI = in.nextInt();
        System.out.print("Enter Your Four Wheeler EMI (2)               : ");
        float TwoWheelerTwoEMI = in.nextInt();
        System.out.print("Enter Your Four Wheeler EMI (1)               : ");
        float ApplianceOne = in.nextInt();
        System.out.print("Enter Your Four Wheeler EMI (2)               : ");
        float ApplianceTwo = in.nextInt();
        System.out.print("Enter Your Four Wheeler EMI (3)               : ");
        float ApplianceThree = in.nextInt();
        System.out.print("Enter Your Four Wheeler EMI (4)               : ");
        float ApplianceFour = in.nextInt();
        System.out.print("Enter Your First Electronic EMI (1)           : ");
        float ElectronicOne = in.nextInt();
        System.out.print("Enter Your Second Electronic EMI (2)          : ");
        float ElectronicTwo = in.nextInt();
        System.out.print("Enter Your Third Electronic EMI (3)           : ");
        float ElectronicThree = in.nextInt();
        System.out.print("Enter Your Fourth Electronic EMI (4)          : ");
        float ElectronicFour = in.nextInt();


        // Print Normal Line
        System.out.println("==============================================================================");

        //  Print Calculation and all Methods
        System.out.println("Your Total Income is                                                    : " + TotalIncome);
        float Remaining = TotalIncome - FirstPersonalEmi;
        System.out.println("The remaining Amount After First Personal EMI is                        : " + Remaining);
        Remaining = Remaining - SecondPersonalEMI;
        System.out.println("The Remaining Amount After Second Personal EMI is                       : " + Remaining);
        Remaining = Remaining - HomeLoanEMI;
        System.out.println("The Remaining Amount After Home Loan EMI                                : " + Remaining);
        Remaining = Remaining - FourWheelerOneEMI;
        System.out.println("The Remaining Amount After Four Wheeler One EMI                         : " + Remaining);
        Remaining = Remaining - FourWheelerTwoEMI;
        System.out.println("The Remaining Amount After Four Wheeler two EMI                         : " + Remaining);
        Remaining = Remaining - FourWheelerThreeEMI;
        System.out.println("The Remaining Amount After Four Wheeler Three EMI                       : " + Remaining);
        Remaining = Remaining - FourWheelerFourEMI;
        System.out.println("The Remaining Amount After Four Wheeler Four EMI                        : " + Remaining);
        Remaining = Remaining - TwoWheelerOneEMI;
        System.out.println("The Remaining Amount After Two Wheeler One EMI                          : " + Remaining);
        Remaining = Remaining - TwoWheelerTwoEMI;
        System.out.println("The Remaining Amount After Two Wheeler Two EMI                          : " + Remaining);
        Remaining = Remaining - ApplianceOne;
        System.out.println("The Remaining Amount After Appliance One                                : " + Remaining);
        Remaining = Remaining - ApplianceTwo;
        System.out.println("The Remaining Amount After Appliance Two                                : " + Remaining);
        Remaining = Remaining - ApplianceThree;
        System.out.println("The Remaining Amount After Appliance Three                              : " + Remaining);
        Remaining = Remaining - ApplianceFour;
        System.out.println("The Remaining Amount After Appliance Four                               : " + Remaining);
        Remaining = Remaining - ElectronicOne;
        System.out.println("The Remaining Amount After First Electronic                             : " + Remaining);
        Remaining = Remaining - ElectronicTwo;
        System.out.println("The Remaining Amount After Second Electronic                            : " + Remaining);
        Remaining = Remaining - ElectronicThree;
        System.out.println("The Remaining Amount After Third Electronic                             : " + Remaining);
        Remaining = Remaining - ElectronicFour;
        System.out.println("The Remaining Amount After Fourth Electronic                            : " + Remaining);

        System.out.println("The Total Remaining Balance Is                                          : " + Remaining);


        System.out.println("==============================================================================");

    }

}
