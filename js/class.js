// 클래스 생성
class Person {
    constructor(first, last, age, gender, interests) {
        this.first = first;
        this.last = last;
        this.age = age;
        this.gender = gender;
        this.interests = interests;
    }
}

let p1 = new Person('Bob', 'Smith', 32, 'male', ['music', 'skiing']);
console.log(`${p1.first} ${p1.last}`);

// 클래스 상속
class Teacher extends Person {
    constructor(first, last, age, gender, interests, subject) {
        super(first, last, age, gender, interests);
        this.subject = subject;
    }
}

let teacher1 = new Teacher('Dave', 'Griffiths', 31, 'male', ['football', 'cookery'], 'mathematics');

Object.keys(teacher1).forEach((property) => {
    console.log(`${property} : ${teacher1[property]}`);
});
