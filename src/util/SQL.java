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

create table ThongKeTienDo(
	IDMucTieu int primary key,
	TienDo int not null,
	ThoiGianConLai int not null
)

create table LichSu(
	IDLichSu int identity(1,1) primary key,
	IDMucTieu int not null,
	NgayTK date not null,
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

create table ThongKeChiTieu(
	Username nvarchar(50) primary key,
	TongThu float not null,
	TongChi float not null,
	SoDu float not null
)

alter table MucTieuTietKiem
add constraint FK_MTTK_ND
foreign key (Username)
references NguoiDung(Username)

alter table LichSu
add constraint FK_LS_MTTK
foreign key (IDMucTieu)
references MucTieuTietKiem(IDMucTieu)

alter table ThongKeTienDo
add constraint FK_MTTK_TKTD
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

alter table ThongKeChiTieu
add constraint FK_TKCT_ND
foreign key (Username)
references NguoiDung(Username)
    */
}
