package tumpukan;

public class tumpukanGG {
    private node topGanjil;
    private node topGenap;
    private int countGanjil;
    private int countGenap;

    public tumpukanGG() {
        topGanjil = null;
        topGenap = null;
        countGanjil = 0;
        countGenap = 0;
    }

    public boolean isEmptyGanjil() {
        return topGanjil == null;
    }

    public boolean isEmptyGenap() {
        return topGenap == null;
    }

    public void push(Integer data) {
        if (data == null) {
            System.out.println("Data null tidak dapat dimasukkan.");
            return;
        }

        node newNode = new node(data, null);
        if (data % 2 == 0) {
            newNode.setPtr(topGenap);
            topGenap = newNode;
            countGenap++;
        } else {
            newNode.setPtr(topGanjil);
            topGanjil = newNode;
            countGanjil++;
        }
    }

    public void popGanjil() {
        if (isEmptyGanjil()) {
            System.out.println("Tumpukan ganjil kosong, tidak ada elemen untuk dihapus.");
        } else {
            System.out.println("Menghapus elemen ganjil: " + topGanjil.getData());
            topGanjil = topGanjil.getPtr();
            countGanjil--;
        }
    }

    public void popGenap() {
        if (isEmptyGenap()) {
            System.out.println("Tumpukan genap kosong, tidak ada elemen untuk dihapus.");
        } else {
            System.out.println("Menghapus elemen genap: " + topGenap.getData());
            topGenap = topGenap.getPtr();
            countGenap--;
        }
    }

    public void cetakGanjil() {
        if (isEmptyGanjil()) {
            System.out.println("Tumpukan ganjil kosong.");
            return;
        }
        System.out.println("Isi tumpukan ganjil:");
        node temp = topGanjil;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getPtr();
        }
    }

    public void cetakGenap() {
        if (isEmptyGenap()) {
            System.out.println("Tumpukan genap kosong.");
            return;
        }
        System.out.println("Isi tumpukan genap:");
        node temp = topGenap;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getPtr();
        }
    }

    public int getCountGanjil() {
        return countGanjil;
    }

    public int getCountGenap() {
        return countGenap;
    }
}
