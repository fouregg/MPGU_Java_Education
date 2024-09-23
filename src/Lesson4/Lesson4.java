package Lesson4;

public class Lesson4 {
    public static void main(String[] args) {
        exerciseString();
    }
    public static String deletePunctuation(String word) {
        while (!Character.isAlphabetic(word.charAt(0)) || !Character.isAlphabetic(word.charAt(word.length()-1)))
        {
            if (!Character.isAlphabetic(word.charAt(0)))
                word = word.substring(1);
            if (!Character.isAlphabetic(word.charAt(word.length()-1)))
                word = word.substring(0, word.length()-1);
        }
        return word;
    }

    public static void introductionString() {
        String str = "   ���� ���� ����, ���� ����� ������";

        // �� ��������
        for (int i = 0; i < str.length(); i++)
            System.out.println(str.charAt(i));

        // �� ���������
        for (char symbol : str.toCharArray()) {
            System.out.println(symbol);
        }

        // ������������� � ���� ������� ��������
        char[] symbols = str.toCharArray();

        // �������� ������ �� ������� - str.charAt(index)
        System.out.println(str.charAt(0));
        // �������� ��������� �� ������ - str.substring(beginIndex, [endIndex]). endIndex - �� ������������
        System.out.println(str.substring(str.length() - 6)); // ������
        System.out.println(str.substring(0, 4)); // ����
        // ��������� �������� �� ������ ��������� - str.contains(substr)
        System.out.println(str.contains("����"));
        // �������� ������ � ������� ��� �������� ��������(��������� ��� ��������� �����) - toLowerCase(), toUpperCase()
        System.out.println(str.toLowerCase().contains("����"));

        // ������ "����������" ������� � ����� � ������ ������ - str.trim(). ����������� ������ trim - strip.
        // �������� � ��������� unicode
        str = str.trim();
        // �������� ������ �������� - str.split(splitter) - ��� splitter - ����������� � ���� ������.
        String [] words = str.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        // �������� ������ �� �������(����� ������� ������� - str.indexOf(charFind/strFind, [indexBegin]).
        // ����� ������ ��� �������, ��� � ������. IndexBegin - ������ ���������� ����� - ��� ������ lastIndexOf
        System.out.println(str.toLowerCase().indexOf('�'));
        System.out.println(str.toLowerCase().indexOf('�', 1));

        // �������� �������/��������� �� ������ str.replace(oldSymbol(-s), newSymbol(-s))
        System.out.println(str.replace('�', '�'));

    }

    public static void exerciseString() {
        String str = "���� ���� ����, ���� ����� ���, � ������� ���������� ��� �����";

        // ����� ������� ������ ����� �(�������������, ��� ��� ����������)
        int countA = 0, lastPosA = 0;
        while (countA < 3)
        {
             lastPosA = str.indexOf('�', lastPosA + 1);
             countA++;
        }
        System.out.println("Third a on position:" + lastPosA);

        // ����� ������� ������ ����� � � ��������� ������������� 3 ������ ����� �
        while (countA < 3 && (lastPosA = str.indexOf('�', lastPosA + 1)) != -1)
            countA++;
        System.out.println(countA == 3 ? "Third a on position: " + lastPosA : "Doesn't exist third A");

        // ����� ����� � ����������� ������� 4 ��������
        String[] words = str.split(" ");
        for(String word: words)
        {
            if (word.length() > 4)
            {
                System.out.println("Word with length bigest 4 is:" + word);
                break;
            }
        }

        // ����� ����� � ����������� ������� 4 ��������(�� �������� ������ ����������)
        words = str.split(" ");
        for(String word: words)
        {
            deletePunctuation(word);
            if (word.length() > 4)
            {
                System.out.println("Word with length bigest 4 is:" + word);
                break;
            }
        }

        // ����� ��� ���������� � ������

        words = str.split(" ");
        String[] massAnswer = {};
        for(String word: words)
        {
            word = word.toLowerCase();
            // ������� ���������� � ����� � ���� ����
            deletePunctuation(word);
            if(word.length() > 1)
            {
                StringBuilder reverseWord = new StringBuilder();
                for (int i = word.length() -1; i >= 0; i--)
                    reverseWord.append(word.charAt(i));
                if (word.equals(reverseWord.toString()))
                {
                    String[] tmp = new String[massAnswer.length + 1];
                    System.arraycopy(massAnswer, 0, tmp, 0, massAnswer.length);
                    tmp[massAnswer.length] = word;
                    massAnswer = tmp;
                }
            }
        }
        System.out.print("������ �����������: ");
        for (String s : massAnswer) System.out.print(s + " ");
    }


}
