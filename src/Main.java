import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Pc> pcs = new HashSet<>();
        pcs.add(new Pc("Macbook air", 2, 256, Os.MacOS, "Серебренный"));
        pcs.add(new Pc("Maibenben PC40", 4, 128, Os.Linux, "Жёлтый"));
        pcs.add(new Pc("Windows Laptop", 32, 1000, Os.Windows, "Зелёный"));
        pcs.add(new Pc("HP LP500", 8, 512, Os.Windows, "Красный"));
        Map<String, Object> filter = new HashMap<>();
        text start = new text();
        System.out.println(start);

        while (true) {
            System.out.println("Введите цифру, соответствующую необходимому критерию!!!");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();

            if (num >= 1 && num <= 2) {
                System.out.println("Введите min значение для подборки: ");
                int minValue = scanner.nextInt();
                filter.put(String.valueOf(num), minValue);
            } else if (num == 4){
                System.out.println("Выберите цвет: ");
                String value = scanner.next();
                filter.put(String.valueOf(num), value);
            } else if (num == 3) {
                System.out.println("Выберите ОС:\n" +
                        "1. Windows\n2. Linux\n3. MacOS");
                int value = scanner.nextInt();
                switch (value){
                    case 1:
                        filter.put(String.valueOf(num), Os.Windows);
                        break;
                    case 2:
                        filter.put(String.valueOf(num), Os.Linux);
                        break;
                    case 3:
                        filter.put(String.valueOf(num), Os.MacOS);
                        break;
                }

            }else if (num == 5) {
                for (Pc pcc : pcs) {
                    boolean matches =true;
                    for (Map.Entry<String, Object> entry : filter.entrySet()) {
                        switch (entry.getKey()) {
                            case "1":
                                matches = pcc.getRam() >= (int) entry.getValue();
                                break;
                            case "2":
                                matches = pcc.getHd_volumeGB() >= (int) entry.getValue();
                                break;
                            case "3":
                                matches = pcc.getOs().equals(entry.getValue());
                                break;
                            case "4":
                                matches = pcc.getColor().equals(entry.getValue());
                                break;
                        }
                    }if (matches == true){
                        System.out.println(pcc);
                    }
                }
                break;
            }
        }
    }
}