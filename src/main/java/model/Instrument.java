/*
 * The MIT License (MIT)
 * Copyright (c) 2020 Leif Lindbäck
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction,including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so,subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package model;

/**
 * An account in the bank.
 */
public class Instrument implements InstrumentDTO {
    private int instrumentId;
    private String rentingFee;
    private String type;
    private String brand;
    private String status;

    private int studentId;
    private int personId;
    private int memberId;
    private String studentName;
    private int totalRentedInstrumentsCurrently;
    private String rentingStatus;
    private String rentDate;
    private String returnDate;
    private String rentalStatus;

    private int maxNumOfStudents;
    private int minNumOfStudents;
    private int year;
    private int weekNumber;
    private int day;
    private String genre;
    private String typeOfLesson;
    private String ensembleStatus;


    //Instrument Tables
    public Instrument(int instrumentId,String type,String brand, String rentingFee, String status) {
        this.instrumentId = instrumentId;
        this.type = type;
        this.brand = brand;
        this.rentingFee = rentingFee;
        this.status = status;
    }

    //ensemble_statistics Views
    public Instrument(String genre, int maxNumOfStudents, int minNumOfStudents, int year, int weekNumber, int day,
                      String ensembleStatus) {
        this.genre = genre;
        this.maxNumOfStudents = maxNumOfStudents;
        this.minNumOfStudents = minNumOfStudents;
        this.year = year;
        this.weekNumber = weekNumber;
        this.day = day;
        this.ensembleStatus = ensembleStatus;
    }

    // rented_instruments_info Views
    public Instrument(int instrumentId, String rentingFee, String type, String brand, String studentName,
                      String rentDate, String returnDate, String rentalStatus) {
        this.brand = brand;
        this.instrumentId = instrumentId;
        this.rentingFee = rentingFee;
        this.type = type;
        this.studentName = studentName;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.rentalStatus = rentalStatus;
    }









    /**
     * @return The account number.
     */
    public String getType() {
        return type;
    }

    /**
     * @return The account number.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @return The account number.
     */
    public String getStatus() {
        return status;
    }

    /**
     * @return The balance.
     */
    public int getInstrumentId() {
        return instrumentId;
    }

    /**
     * @return The holder's name.
     */
    public String getRentingFee() {
        return rentingFee;
    }

    /**
     * @return The holder's name.
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * @return The holder's name.
     */
    public String getRentingStatus() {
        return rentingStatus;
    }




    /**
     * @return The holder's name.
     */
    public int getTotalRentedInstrumentsCurrently() {
        return totalRentedInstrumentsCurrently;
    }

    /**
     * @return The holder's name.
     */
    public String getRentDate() {
        return rentDate;
    }

    /**
     * @return The holder's name.
     */
    public String getReturnDate() {
        return returnDate;
    }

    /**
     * @return The balance.
     */
    public int getMaxNumOfStudents() {
        return maxNumOfStudents;
    }

    /**
     * @return The balance.
     */
    public int getMinNumOfStudents() {
        return minNumOfStudents;
    }

    /**
     * @return The balance.
     */
    public int getYear() {
        return year;
    }

    /**
     * @return The balance.
     */
    public int getWeekNumber() {
        return weekNumber;
    }

    /**
     * @return The balance.
     */
    public int getDay() {
        return day;
    }

    /**
     * @return The holder's name.
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @return The holder's name.
     */
    public String getTypeOfLesson() {
        return typeOfLesson;
    }

    /**
     * @return The holder's name.
     */
    public String getEnsembleStatus() {
        return ensembleStatus;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getRentalStatus() {
        return rentalStatus;
    }

    // *************************************************************************************************************************/

    /**
     * @return A string representation of all fields in this object.
     */
    @Override
    public String toString() {
        StringBuilder stringRepresentation = new StringBuilder();
        stringRepresentation.append("Instrument: [");
        stringRepresentation.append("status: ");
        stringRepresentation.append(status);
        stringRepresentation.append(",  rentingStatus: ");
        stringRepresentation.append(rentingStatus);
        stringRepresentation.append(",  studentId: ");
        stringRepresentation.append(studentId);
        stringRepresentation.append(",  totalRentedInstrumentsCurrently: ");
        stringRepresentation.append(totalRentedInstrumentsCurrently);
        stringRepresentation.append(",  type: ");
        stringRepresentation.append(type);
        stringRepresentation.append(", renting fee: ");
        stringRepresentation.append(rentingFee);
        stringRepresentation.append(",  brand: ");
        stringRepresentation.append(brand);
        stringRepresentation.append(", instrument-id: ");
        stringRepresentation.append(instrumentId);

        stringRepresentation.append("]");
        return stringRepresentation.toString();
    }
}

