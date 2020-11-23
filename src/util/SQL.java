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

create table QuanLyThuChi(
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

alter table LichSu
add constraint FK_LS_MTTK
foreign key (IDMucTieu)
references MucTieuTietKiem(IDMucTieu)

alter table QuanLyThuChi
add constraint FK_QLT_ND
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

create proc TongThu @User nvarchar(50)
as
begin
	select MONTH(NgayGD) as 'Thang',SUM(SoTien) as 'TongThu'
	from QuanLyThuChi where LoaiGD='Thu'
	group by MONTH(NgayGD)
end

create proc TongChi @User nvarchar(50)
as
begin
	select MONTH(NgayGD) as 'Thang',SUM(SoTien) as 'TongThu'
	from QuanLyThuChi where LoaiGD='Chi'
	group by MONTH(NgayGD)
end

alter proc LichSu_ThuChi @User nvarchar(50)
as
begin
	select TenGD,NgayGD,SoTien,LoaiGD from NguoiDung nd
	inner join QuanLyThuChi qltc on nd.Username=qltc.Username
	where nd.Username=@User
end

alter proc Tinh_SoDu @User nvarchar(50)
as
begin
	declare @tongthu float
	declare @tongchi float
	declare @sodu float
	set @tongthu=(Select SUM(SoTien) from QuanLyThuChi where LoaiGD='Thu')
	set @tongchi=(Select SUM(SoTien) from QuanLyThuChi where LoaiGD='Chi')
	set @sodu=(select @tongthu-@tongchi)
	update NguoiDung set SoDu=@sodu where Username=@User
	select SoDu from NguoiDung where Username=@User
end
    */
}
