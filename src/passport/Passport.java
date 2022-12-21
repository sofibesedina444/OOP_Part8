package passport;

import java.time.LocalDate;
import java.util.Objects;

public class Passport {
    private final String passportNumber;
    private String surname;
    private String name;
    private String middleName;
    private LocalDate dateBirth;

    public Passport(String passportNumber, String surname, String name, String middleName, LocalDate dateBirth) {
        this.passportNumber = passportNumber;
        setSurname(surname);
        setName(name);
        setMiddleName(middleName);
        this.dateBirth = dateBirth;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname == null) {
            throw new IllegalArgumentException("Заполните поле с фамилией");
        } else {
            this.surname = surname;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Заполните поле с именем");
        } else {
            this.name = name;
        }
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = Objects.requireNonNullElse(middleName, "Отсутствует");
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    @Override
    public String toString() {
        return "Номер паспорта: " + passportNumber + "\n" +
                "Фамилия : " + surname + "\n" +
                "Имя: " + name + "\n" +
                "Отчество: " + middleName + "\n" +
                "Дата рождения: " + dateBirth + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Passport)) return false;
        Passport passport = (Passport) o;
        return Objects.equals(passportNumber, passport.passportNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNumber);
    }
}
