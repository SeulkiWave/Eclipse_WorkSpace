DROP TABLE member CASCADE CONSTRAINTS;

/**********************************/
/* Table Name: member */
/**********************************/
CREATE TABLE member(
		memID                         		VARCHAR2(20)		 NULL ,
		memPW                         		VARCHAR2(30)		 NULL ,
		memName                       		VARCHAR2(50)		 NULL ,
		memAddress                    		VARCHAR2(100)		 NULL ,
		memAge                        		NUMBER(3)		 DEFAULT 0		 NULL ,
		memMarried                    		CHAR(1)		 DEFAULT 'F'		 NULL ,
		memRDate                      		DATE		 DEFAULT sysdate		 NULL 
);

COMMENT ON TABLE member is 'member';
COMMENT ON COLUMN member.memID is 'memID';
COMMENT ON COLUMN member.memPW is 'memPW';
COMMENT ON COLUMN member.memName is 'memName';
COMMENT ON COLUMN member.memAddress is 'memAddress';
COMMENT ON COLUMN member.memAge is 'memAge';
COMMENT ON COLUMN member.memMarried is 'memMarried';
COMMENT ON COLUMN member.memRDate is 'memRDate';



ALTER TABLE member ADD CONSTRAINT IDX_member_PK PRIMARY KEY (memID);

