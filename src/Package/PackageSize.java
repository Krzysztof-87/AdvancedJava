package Package;
/*
Zadanie 2
Stwórz klasę enum PackageSize ze stałymi SMALL , MEDIUM , LARGE . Enum
powinien przyjmować w konstruktorze dwa parametry:
minimalny rozmiar paczki w cm
maksymalny rozmiar paczki w cm
Dodatkowo enum PackageSize powinien zawierać metodę statyczną
getPackageSize , która przyjmuje na wejściu minimalny i maksymalny rozmiar
paczki, a jako rezultat powinna zwracać konkretny obiekt PackageSize na
podstawie przekazanego rozmiaru paczki
 */

public enum PackageSize {

    SMALL(10,30),
    MEDIUM(31,60),
    LARGE(61,90);

    private double minSize;
    private double maxSize;

    PackageSize(double minSize, double maxSize) {
        this.minSize = minSize;
        this.maxSize = maxSize;
    }

     static PackageSize getPackageSize(double min, double max){
         for (PackageSize packageSize :PackageSize.values()) {
             if (min>packageSize.minSize&&max<packageSize.maxSize){
                 return packageSize;
             }
         }
         return null;
    }

    @Override
    public String toString() {
        return "PackageSize{" +
                "minSize=" + minSize +
                ", maxSize=" + maxSize +
                '}';
    }
}
