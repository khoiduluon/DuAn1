/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Rom
 */
public class SQL {
    /*
    create database QLTK
go
use QLTk
go
create table NguoiDung(
	Username nvarchar(50) primary key,
	TenND nvarchar(50) not null,
	GioiTinh bit,
	Pass nvarchar(50) not null,
	SoDu float default(0)
)

create table MucTieuTietKiem(
	IDMucTieu int identity(1,1) primary key,
	Username nvarchar(50) not null,
	TenMT nvarchar(100) not null,
	GiaTri float not null,
	ThoiHan int not null,
	SoTienDaTK float default(0),
	NgayTao date Default(Getdate())
)

create table LichSu(
	IDLichSu int identity(1,1) primary key,
	IDMucTieu int not null,
	NgayTK date Default(Getdate()),
	SoTienTK float not null
)

create table DoanhMucThuChi(
	ID int identity(1,1) primary key,
	Username nvarchar(50) not null,
	TenGD nvarchar(100) not null,
	SoTien float not null,
	NgayGD date not null,
	LoaiGD nvarchar(15) not null
)


alter table MucTieuTietKiem
add constraint FK_MTTK_ND
foreign key (Username)
references NguoiDung(Username)
on delete cascade on update cascade

alter table LichSu
add constraint FK_LS_MTTK
foreign key (IDMucTieu)
references MucTieuTietKiem(IDMucTieu)
on delete cascade on update cascade

alter table DoanhMucThuChi
add constraint FK_QLT_ND
foreign key (Username)
references NguoiDung(Username)
on delete cascade on update cascade

create proc LichSuMTK @User nvarchar(50)
as
begin
	select IDLichSu,MucTieuTietKiem.TenMT,NgayTK,SoTienTK from LichSu inner join MucTieuTietKiem on LichSu.IDMucTieu=MucTieuTietKiem.IDMucTieu
	where Username=@User
end;
exec LichSuMTK 'Ngandhl'

create proc LichSuMTK2 @User nvarchar(50),@TenMTK nvarchar(50)
as
begin
	select IDLichSu,MucTieuTietKiem.TenMT,NgayTK,SoTienTK from LichSu 
	inner join MucTieuTietKiem on LichSu.IDMucTieu=MucTieuTietKiem.IDMucTieu
	where Username=@User and TenMT like '%'+@TenMTK+'%'
end;
exec LichSuMTK2 'Ngandhl',N'heo'

create proc TongThu @User nvarchar(50)
as
begin
	select MONTH(NgayGD) as 'Thang',SUM(SoTien) as 'TongThu'
	from DoanhMucThuChi where LoaiGD='Thu'
	group by MONTH(NgayGD)
end

create proc TongChi @User nvarchar(50)
as
begin
	select MONTH(NgayGD) as 'Thang',SUM(SoTien) as 'TongChi'
	from DoanhMucThuChi where LoaiGD='Chi'
	group by MONTH(NgayGD)
end

create proc LichSu_ThuChi @User nvarchar(50)
as
begin
	select ID,TenGD,NgayGD,SoTien,LoaiGD from NguoiDung nd
	inner join DoanhMucThuChi tc on nd.Username=tc.Username
	where nd.Username=@User
end

    */
}
