public class Exercise_7
{

    public static void main(String[] args)
    {
        LinkedIntList linkedIntList = new LinkedIntList();

        linkedIntList.add(1);
        linkedIntList.add(2);
        linkedIntList.add(3);
        linkedIntList.add(4);
        linkedIntList.add(5);
        linkedIntList.add(5);
        linkedIntList.add(6);
        System.out.println("List before deleting: ");
        System.out.println(linkedIntList);
        System.out.println(deleteBack(linkedIntList));
        System.out.println("List after deleteing: ");
        System.out.println(linkedIntList);

    }


    public static int deleteBack (LinkedIntList linkedIntList)
    {
        ListNode current = linkedIntList.getFront();
        int lastValue=0;
        int listSize = linkedIntList.size();

        for (int i = 0; i < listSize; i++)
        {
            if (current.next.next == null)
            {
                current.next = null;
                break;
            }
            current = current.next;
        }

        
        return lastValue;

    }
}
