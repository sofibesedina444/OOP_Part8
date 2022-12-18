package passport;

import java.util.Set;

public class PassportList {
    private Set<Passport> passports;

    public PassportList(Set<Passport> passports) {
        this.passports = passports;
    }

    public void addPassport(Passport passport) {
        Passport have = checkPassportNumber(passport.getPassportNumber());
        if (have != null) {
            passports.remove(have);
        }
        passports.add(passport);
    }

    public Passport checkPassportNumber(String passportNumber) {
        for (Passport passport : passports) {
            if (passport.getPassportNumber().equals(passportNumber)) {
                return passport;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Список паспартов: " + "\n" + passports;
    }
}
