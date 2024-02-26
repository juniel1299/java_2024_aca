create table tblAddress(

    seq number primary key,                     --PK
    name varchar2(30) not null,                     --이름
    age number(3) not null check (age between 0 and 150),           --나이
    gender char(10) not null check(gender in ('m','f')),            --성별(m,f)
    tel varchar2(15) not null,                              --전화번호
    address varchar2(300) not null,                     --주소
    regdate date default sysdate not null               --등록일
);

create sequence seqAddress;


--CRUD + 추가 업무

insert into tblAddress (seq,name,age,gender,tel,address,regdate)
values
(
seqAddress.nextVal,'홍길동',20,'m','010-1234-5678','서울시 강남구 역삼동 한독빌딩',default);

select * from tblAddress;

update tbladdress set age = age + 1 where seq = 1;

delete from tblAddress where seq = 6;

select * from tbladdress;
commit;