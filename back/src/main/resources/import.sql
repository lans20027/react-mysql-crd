insert into users(id,birthday,email,name,surname) select next_val, "1997-12-27",  "lans20027@gmail.com",  "Alex","Vydrin" from hibernate_sequence;

update hibernate_sequence set next_val = 2;