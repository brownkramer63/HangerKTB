insert into client(identity ,firstName,lastName,email,phoneNumber,password)
values(1,'kramer','brown','kramer.t.brown@gmail.com',2177413554,'Fish'),
      (2,'marissa', 'tatro', 'gyp@gmail.com',6668889999,'hhhh');

insert into services(identity ,serviceName,serviceDuration,servicePrice,serviceStartTime,serviceEndTime,serviceTimeRemaining,client_id)
values (3,'locker1', '2022-09-15 00:00:00', 20.00, '2022-09-15 00:00:00','2022-09-15 00:00:00','2022-09-15 00:00:00',1 ),
       (4,'locker2','2022-09-15 00:00:00',30.00,'2022-09-15 00:00:00','2022-09-15 00:00:00','2022-09-15 00:00:00',2);