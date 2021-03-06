USE [J3.L.P0001]
GO
/****** Object:  Table [dbo].[Quiz]    Script Date: 6/6/2021 10:42:27 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Quiz](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[question] [nvarchar](255) NOT NULL,
	[option1] [nvarchar](50) NULL,
	[option2] [nvarchar](50) NULL,
	[option3] [nvarchar](50) NULL,
	[option4] [nvarchar](50) NULL,
	[result] [int] NULL,
	[date] [date] NULL,
	[createdBy] [int] NULL,
 CONSTRAINT [PK_Quiz] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Type]    Script Date: 6/6/2021 10:42:27 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Type](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](50) NULL,
 CONSTRAINT [PK_Type] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[User]    Script Date: 6/6/2021 10:42:27 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[User](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[user] [nvarchar](50) NOT NULL,
	[pass] [nvarchar](50) NOT NULL,
	[typeId] [int] NOT NULL,
	[email] [nvarchar](50) NULL,
 CONSTRAINT [PK_User] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Quiz] ON 

INSERT [dbo].[Quiz] ([id], [question], [option1], [option2], [option3], [option4], [result], [date], [createdBy]) VALUES (1, N'The name of captial of VietNam after year of 1975?', N'Sai Gon', N'Ho Chi Minh', N'Ha Noi', N'Ha Tay', 3, CAST(N'2021-05-26' AS Date), 3)
INSERT [dbo].[Quiz] ([id], [question], [option1], [option2], [option3], [option4], [result], [date], [createdBy]) VALUES (2, N'Calculate: 1 + 2 = ?', N'1', N'0', N'2', N'3', 4, CAST(N'2021-05-26' AS Date), 2)
INSERT [dbo].[Quiz] ([id], [question], [option1], [option2], [option3], [option4], [result], [date], [createdBy]) VALUES (3, N'Where is the FPT University Ha Noi?', N'Hai Ba Trung', N'Cau Giay', N'Hoa Lac', N'Dong Da', 3, CAST(N'2021-05-26' AS Date), 3)
INSERT [dbo].[Quiz] ([id], [question], [option1], [option2], [option3], [option4], [result], [date], [createdBy]) VALUES (4, N'What is your country?', N'England', N'Italia', N'Vietnam', N'China', 3, CAST(N'2021-06-02' AS Date), 2)
INSERT [dbo].[Quiz] ([id], [question], [option1], [option2], [option3], [option4], [result], [date], [createdBy]) VALUES (5, N'What is your Major ?', N'Software Engineering', N'Graphic Design', N'Multimedia', N'Marketing', 1, CAST(N'2021-06-02' AS Date), 3)
INSERT [dbo].[Quiz] ([id], [question], [option1], [option2], [option3], [option4], [result], [date], [createdBy]) VALUES (6, N'The capital of Spain?', N'Barcelona', N'London', N'Mardrid', N'Bangkok', 3, CAST(N'2021-06-02' AS Date), 2)
INSERT [dbo].[Quiz] ([id], [question], [option1], [option2], [option3], [option4], [result], [date], [createdBy]) VALUES (7, N'Who invented the electric light?', N'Thomas Edison', N'Elbert Einstein', N'Archimedes', N'Newton', 1, CAST(N'2021-06-02' AS Date), 3)
INSERT [dbo].[Quiz] ([id], [question], [option1], [option2], [option3], [option4], [result], [date], [createdBy]) VALUES (8, N'What is the most popular language in the wolrd?', N'Vietnamese', N'Japanese', N'English', N'French', 3, CAST(N'2021-06-02' AS Date), 2)
INSERT [dbo].[Quiz] ([id], [question], [option1], [option2], [option3], [option4], [result], [date], [createdBy]) VALUES (9, N'Which tool do your use to coding Java in FPT?', N'InteliJ idea', N'NetBeans', N'Esclip', N'Notepad++', 2, CAST(N'2021-06-02' AS Date), 3)
INSERT [dbo].[Quiz] ([id], [question], [option1], [option2], [option3], [option4], [result], [date], [createdBy]) VALUES (10, N'What is the biggest contry in the wolrd?', N'Korea', N'Canada', N'China', N'Russia', 4, CAST(N'2021-06-02' AS Date), 2)
SET IDENTITY_INSERT [dbo].[Quiz] OFF
GO
SET IDENTITY_INSERT [dbo].[Type] ON 

INSERT [dbo].[Type] ([id], [name]) VALUES (1, N'student')
INSERT [dbo].[Type] ([id], [name]) VALUES (2, N'teacher')
SET IDENTITY_INSERT [dbo].[Type] OFF
GO
SET IDENTITY_INSERT [dbo].[User] ON 

INSERT [dbo].[User] ([id], [user], [pass], [typeId], [email]) VALUES (1, N'ChauDM', N'123', 1, N'chaudm@gmail.com')
INSERT [dbo].[User] ([id], [user], [pass], [typeId], [email]) VALUES (2, N'admin', N'123', 2, N'admin@gmail.com')
INSERT [dbo].[User] ([id], [user], [pass], [typeId], [email]) VALUES (3, N'teacher', N'123', 2, N'teacher@gmail.com')
INSERT [dbo].[User] ([id], [user], [pass], [typeId], [email]) VALUES (4, N'loda', N'123', 1, N'loda@gmail.com')
INSERT [dbo].[User] ([id], [user], [pass], [typeId], [email]) VALUES (5, N'minhchauck', N'123', 1, N'minhchau8ack@gmail.com')
INSERT [dbo].[User] ([id], [user], [pass], [typeId], [email]) VALUES (6, N'chou', N'123', 2, N'chou@gmail.com')
INSERT [dbo].[User] ([id], [user], [pass], [typeId], [email]) VALUES (7, N'teacher1', N'123', 2, N'asdsd')
SET IDENTITY_INSERT [dbo].[User] OFF
GO
ALTER TABLE [dbo].[Quiz]  WITH CHECK ADD  CONSTRAINT [FK_Quiz_User1] FOREIGN KEY([createdBy])
REFERENCES [dbo].[User] ([id])
GO
ALTER TABLE [dbo].[Quiz] CHECK CONSTRAINT [FK_Quiz_User1]
GO
ALTER TABLE [dbo].[User]  WITH CHECK ADD  CONSTRAINT [FK_User_Type] FOREIGN KEY([typeId])
REFERENCES [dbo].[Type] ([id])
GO
ALTER TABLE [dbo].[User] CHECK CONSTRAINT [FK_User_Type]
GO
