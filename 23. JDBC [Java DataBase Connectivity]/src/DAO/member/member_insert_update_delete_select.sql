-- insert
    INSERT INTO member (memID, memPW, memName, memAddress, memAge, memMarried, memRDate)
        VALUES ('aaaa', '1111', '김슬기', '통영시', 24, 'F', sysdate);
    INSERT INTO member (memID, memPW, memName, memAddress, memAge, memMarried, memRDate)
        VALUES ('bbbb', '2222', '황원탁', '전주시', 23, 'T', sysdate);
    INSERT INTO member (memID, memPW, memName, memAddress, memAge, memMarried, memRDate)
        VALUES ('cccc', '3333', '이보리', '서울시', 5, 'F', sysdate);

-- update by pk
    update member set memPW = '0000', memName = '강수미', memAddress = '서울시', memMarried = 'F'
        where memID = 'bbbb';

-- delete by pk
    delete from member where memID = 'aaaa';

-- select by pk
    select * from member where memID = 'bbbb';

-- select all
    select * from member;

-- insert into member memPW = '1111', memName = '김슬기', memAddress = '통영시', memMarried = 'F'
--     where memID = 'aaaa';

commit;