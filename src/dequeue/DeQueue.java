package dequeue;
public class DeQueue
{
    int arr[];
    int rear;
    int front;
    DeQueue(int size)
    {
        rear = -1;
        front = -1;
        arr=new int [size];
    }
    public boolean isempty()
    {
        return (rear == -1 && front== -1);
    }
    public boolean isfull_rear()
    {
        boolean response;
        if(rear == arr.length-1)
        {
           response = true;
        }
        else
        {
            response = false;
        }
        return response;
    }
    public boolean isfull_front()
    {
        if(front ==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void insert_rear(int data)
    {
        if (isfull_rear())
        {
            System.out.println("overflow");
        } else
            {
            if (front == -1 && rear == -1)
            {
                rear = front = 0;
                arr[rear] = data;
            }
            else
                {
                rear++;
                arr[rear] = data;
                }
        }

    }
    public void insert_front(int data)
    {
        if(isfull_front())
        {
            System.out.println("overflow");
        }
        else
        {
            if(front == -1 && rear ==-1)
            {
                rear= front =0;
                arr[front] = data;
            }
            else
            {
                front--;
                arr[front] = data;
            }
        }
    }
    public void remove_rear()
    {
        if(isempty())
        {
            System.out.println("underflow");
        }
        else
        {
            if(rear == front)
            {
                System.out.println(arr[rear]);
                rear = front = -1;
            }
            else
            {
                System.out.println(arr[rear]);

                rear--;

            }

        }

    }
    public void remove_front()
    {
        if (isempty())
        {
            System.out.println("underflow");
        }
        else
        {
            if (front == rear)
            {
                System.out.println(arr[front]);
                rear = front = -1;
            }
            else
                {
                System.out.println(arr[front]);
                front++;
                }
        }
    }
 public void display()
    {
        for(int i =front; i<=rear;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args)
    {
        DeQueue sc = new DeQueue(5);
        sc.insert_front(10);
        sc.insert_rear(20);
        sc.insert_rear(30);
        sc.insert_rear(40);
        sc.insert_rear(50);
System.out.println("all the data are: ");
        sc.display();
        System.out.println("delete from front:-");
        sc.remove_front();
        sc.remove_front();
        System.out.println("delete from rear");
        sc.remove_rear();
        sc.remove_rear();
     //   System.out.println("insert value  at rear ");
      //  sc.insert_rear(90);
        System.out.println("print the data");
        sc.display();
    }
}
