#include <iostream>

class Student{
    private: 
        int rollNo;
    public:
        Student(int roll){
            rollNo = roll;
        }

    void display(){
        std::cout << rollNo;
    }
};

int main(){

    Student amrit = Student(10)
    Student laxman = Student(15);


    amrit.display();
    laxman.display();

    return 0;
}