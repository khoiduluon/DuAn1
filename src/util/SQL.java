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
	SoDu float not null
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

create table QuanLyThu(
	IDThu int identity(1,1) primary key,
	Username nvarchar(50) not null,
	LoaiGD nvarchar(100) not null,
	SoTien float not null,
	NgayGD date not null
)

create table QuanLyChi(
	IDChi int identity(1,1) primary key,
	Username nvarchar(50) not null,
	LoaiGD nvarchar(100) not null,
	SoTien float not null,
	NgayGD date not null
)

alter table MucTieuTietKiem
add constraint FK_MTTK_ND
foreign key (Username)
references NguoiDung(Username)

alter table LichSu
add constraint FK_LS_MTTK
foreign key (IDMucTieu)
references MucTieuTietKiem(IDMucTieu)

alter table QuanLyThu
add constraint FK_QLT_ND
foreign key (Username)
references NguoiDung(Username)

alter table QuanLyChi
add constraint FK_QLC_ND
foreign key (Username)
references NguoiDung(Username)

alter proc LichSuMTK @User nvarchar(50)
as
begin
	select IDLichSu,MucTieuTietKiem.TenMT,NgayTK,SoTienTK from LichSu inner join MucTieuTietKiem on LichSu.IDMucTieu=MucTieuTietKiem.IDMucTieu
	where Username=@User
end;
exec LichSuMTK 'Ngandhl'

alter proc LichSuMTK2 @User nvarchar(50),@TenMTK nvarchar(50)
as
begin
	select IDLichSu,MucTieuTietKiem.TenMT,NgayTK,SoTienTK from LichSu 
	inner join MucTieuTietKiem on LichSu.IDMucTieu=MucTieuTietKiem.IDMucTieu
	where Username=@User and TenMT like '%'+@TenMTK+'%'
end;
exec LichSuMTK2 'Ngandhl',N'heo'

alter proc TongChi @User nvarchar(50)
as
begin
	select MONTH(QuanLyChi.NgayGD) as 'Thang', sum(quanlychi.SoTien) as 'TongChi' from NguoiDung
	inner join QuanLyChi on NguoiDung.Username=QuanLyChi.Username
	where NguoiDung.Username=@User
	group by month(QuanLyChi.NgayGD)
end
alter proc TongThu @User nvarchar(50)
as
begin
	select MONTH(QuanLyThu.NgayGD) as 'Thang', sum(QuanLyThu.SoTien) as 'TongChi' from NguoiDung
	inner join QuanLyThu on NguoiDung.Username=QuanLyThu.Username
	where NguoiDung.Username=@User
	group by month(QuanLyThu.NgayGD)
end

exec TongChi 'Ngandhl'
exec TongThu 'Ngandhl'

    */
}
