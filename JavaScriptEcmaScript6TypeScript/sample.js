let user=function(name,gender,phoneNumber) {
    this.name=name;
    this.gender=gender;
    this.phoneNumber=phoneNumber;
    this.info=function(){
        return this;
    }
}
let user1=new user('sanath','m',123123);
console.log(user1.info()+"\n----------");
console.table(user1)