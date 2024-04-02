package home_work_4;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> {
    private T[] data;
    private int numberPosition = 0;
    private int indexNumber;
    private String result = "[ ";

    public DataContainer(T[] data) {
        this.data = data;
    }

    public int add(T item) {
        if (item == null) {
            return numberPosition = -1;
        }
        do {
            T[] tmp = Arrays.copyOf(data, data.length + 1);
            for (int i = 0; i < tmp.length; i++) {
                if (tmp[i] == null) {
                    tmp[i] = item;
                    data = tmp;
                    return numberPosition++;
                }
            }
        } while (data.length - 1 >= 0);

        return numberPosition;
    }

    public T get(int index) {
        if (index >= 0 && index <= data.length - 1) {
            return data[index];
        }
        return null;
    }

    public T[] getItems() {
        return data;
    }

    public boolean delete(int index) {
        if (index > data.length) {
            return false;
        }
        for (int i = index; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }
        T[] tmp = Arrays.copyOf(data, data.length - 1);
        data = tmp;
        return true;
    }


    public boolean delete(T item) {
        if (item == null) {
            return false;
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null && data[i].equals(item)) {
                for (int j = i; j < data.length - 1; j++) {
                    data[j] = data[j + 1];
                }
                data = Arrays.copyOf(data, data.length - 1);
                return true;
            }
        }
        return false;
    }

      public void sort(Comparator <T> comparator){
          for (int i = 0; i < data.length - 1; i++) {
              for (int j = 0; j < data.length - i - 1; j++) {
                  if (comparator.compare(data[j], data[j + 1]) >= 0) {
                      T temp = data[j];
                      data[j] = data[j + 1];
                      data[j + 1] = temp;
                  }
              }
          }
      }

    public String toString() {
        String result = "[";
        boolean firstNonNull = true;
        for (T item : data) {
            if (item != null) {
                if (!firstNonNull) {
                    result += ", ";
                } else {
                    firstNonNull = false;
                }
                result += item;
            }
        }
        result += "]";
        return result;
    }

}
