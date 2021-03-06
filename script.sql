USE [master]
GO
/****** Object:  Database [Sushi]    Script Date: 04/12/2020 19:40:56 ******/
CREATE DATABASE [Sushi] ON  PRIMARY 
( NAME = N'Sushi', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL10_50.ANHTHAO\MSSQL\DATA\Sushi.mdf' , SIZE = 2048KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'Sushi_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL10_50.ANHTHAO\MSSQL\DATA\Sushi_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [Sushi] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [Sushi].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [Sushi] SET ANSI_NULL_DEFAULT OFF
GO
ALTER DATABASE [Sushi] SET ANSI_NULLS OFF
GO
ALTER DATABASE [Sushi] SET ANSI_PADDING OFF
GO
ALTER DATABASE [Sushi] SET ANSI_WARNINGS OFF
GO
ALTER DATABASE [Sushi] SET ARITHABORT OFF
GO
ALTER DATABASE [Sushi] SET AUTO_CLOSE OFF
GO
ALTER DATABASE [Sushi] SET AUTO_CREATE_STATISTICS ON
GO
ALTER DATABASE [Sushi] SET AUTO_SHRINK OFF
GO
ALTER DATABASE [Sushi] SET AUTO_UPDATE_STATISTICS ON
GO
ALTER DATABASE [Sushi] SET CURSOR_CLOSE_ON_COMMIT OFF
GO
ALTER DATABASE [Sushi] SET CURSOR_DEFAULT  GLOBAL
GO
ALTER DATABASE [Sushi] SET CONCAT_NULL_YIELDS_NULL OFF
GO
ALTER DATABASE [Sushi] SET NUMERIC_ROUNDABORT OFF
GO
ALTER DATABASE [Sushi] SET QUOTED_IDENTIFIER OFF
GO
ALTER DATABASE [Sushi] SET RECURSIVE_TRIGGERS OFF
GO
ALTER DATABASE [Sushi] SET  DISABLE_BROKER
GO
ALTER DATABASE [Sushi] SET AUTO_UPDATE_STATISTICS_ASYNC OFF
GO
ALTER DATABASE [Sushi] SET DATE_CORRELATION_OPTIMIZATION OFF
GO
ALTER DATABASE [Sushi] SET TRUSTWORTHY OFF
GO
ALTER DATABASE [Sushi] SET ALLOW_SNAPSHOT_ISOLATION OFF
GO
ALTER DATABASE [Sushi] SET PARAMETERIZATION SIMPLE
GO
ALTER DATABASE [Sushi] SET READ_COMMITTED_SNAPSHOT OFF
GO
ALTER DATABASE [Sushi] SET HONOR_BROKER_PRIORITY OFF
GO
ALTER DATABASE [Sushi] SET  READ_WRITE
GO
ALTER DATABASE [Sushi] SET RECOVERY SIMPLE
GO
ALTER DATABASE [Sushi] SET  MULTI_USER
GO
ALTER DATABASE [Sushi] SET PAGE_VERIFY CHECKSUM
GO
ALTER DATABASE [Sushi] SET DB_CHAINING OFF
GO
USE [Sushi]
GO
/****** Object:  Table [dbo].[Menu]    Script Date: 04/12/2020 19:40:57 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Menu](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](50) NOT NULL,
	[contentMenu] [nvarchar](500) NOT NULL,
	[price] [float] NOT NULL,
 CONSTRAINT [PK_Table_1] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Menu] ON
INSERT [dbo].[Menu] ([id], [name], [contentMenu], [price]) VALUES (1, N'Claritas est etiam processus', N'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book', 12)
INSERT [dbo].[Menu] ([id], [name], [contentMenu], [price]) VALUES (2, N'Duis autem vel eum iriure dolor.', N'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book', 13)
INSERT [dbo].[Menu] ([id], [name], [contentMenu], [price]) VALUES (7, N'Lorem Ipsum passage', N'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book', 14)
INSERT [dbo].[Menu] ([id], [name], [contentMenu], [price]) VALUES (12, N'Finibus Bonorum et Malorum', N'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book', 15)
INSERT [dbo].[Menu] ([id], [name], [contentMenu], [price]) VALUES (14, N'1914 translation by H. Rackham', N'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book', 16)
SET IDENTITY_INSERT [dbo].[Menu] OFF
/****** Object:  Table [dbo].[Information]    Script Date: 04/12/2020 19:40:57 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Information](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[address] [nvarchar](50) NULL,
	[phone] [nvarchar](50) NULL,
	[email] [nvarchar](50) NULL,
	[openDay] [nvarchar](500) NULL,
	[imagePath] [nvarchar](500) NULL,
 CONSTRAINT [PK_Information] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Information] ON
INSERT [dbo].[Information] ([id], [address], [phone], [email], [openDay], [imagePath]) VALUES (1, N'The Sushi Restaurant New York, NY, USA', N'12345', N'anhthao721999@gmail.com', N'Monday Closed<br>Tuesday 12 - 22<br>Wednesday 12 - 22<br>Thursday 12 - 22<br>Friday 11 - 23<br>Saturday 11 - 23<br>Sunday 11 - 22', NULL)
SET IDENTITY_INSERT [dbo].[Information] OFF
/****** Object:  Table [dbo].[Article]    Script Date: 04/12/2020 19:40:57 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Article](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[title] [nvarchar](50) NULL,
	[imagePath] [nvarchar](500) NULL,
	[fullContent] [nvarchar](max) NULL,
	[shortContent] [nvarchar](500) NULL,
 CONSTRAINT [PK_Article] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Article] ON
INSERT [dbo].[Article] ([id], [title], [imagePath], [fullContent], [shortContent]) VALUES (5, N'24 types of sushi rolls', N'sushi.jpg', N'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.', N'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s,')
INSERT [dbo].[Article] ([id], [title], [imagePath], [fullContent], [shortContent]) VALUES (6, N'23 types of sushi rolls', N'sushi.jpg', N'It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using ''Content here, content here'', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for ''lorem ipsum'' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).', N'The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using ''Content here, content here'',')
INSERT [dbo].[Article] ([id], [title], [imagePath], [fullContent], [shortContent]) VALUES (7, N'22 types of sushi rolls', N'sushi.jpg', N'Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of "de Finibus Bonorum et Malorum" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, "Lorem ipsum dolor sit amet..", comes from a line in section 1.10.32.', N'Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old.')
INSERT [dbo].[Article] ([id], [title], [imagePath], [fullContent], [shortContent]) VALUES (8, N'21 types of sushi rolls', N'sushi.jpg', N'There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don''t look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn''t anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. The generated Lorem Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc.', N'There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour,')
INSERT [dbo].[Article] ([id], [title], [imagePath], [fullContent], [shortContent]) VALUES (9, N'20 types of sushi rolls', N'sushi.jpg', N'"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."', N'Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem.')
INSERT [dbo].[Article] ([id], [title], [imagePath], [fullContent], [shortContent]) VALUES (10, N'19 types of sushi rolls', N'sushi.jpg', N'"But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness. No one rejects, dislikes, or avoids pleasure itself, because it is pleasure, but because those who do not know how to pursue pleasure rationally encounter consequences that are extremely painful. Nor again is there anyone who loves or pursues or desires to obtain pain of itself, because it is pain, but because occasionally circumstances occur in which toil and pain can procure him some great pleasure. To take a trivial example, which of us ever undertakes laborious physical exercise, except to obtain some advantage from it? But who has any right to find fault with a man who chooses to enjoy a pleasure that has no annoying consequences, or one who avoids a pain that produces no resultant pleasure?"', N'Nor again is there anyone who loves or pursues or desires to obtain pain of itself, because it is pain, but because occasionally circumstances occur in which toil and pain can procure him some great pleasure.')
INSERT [dbo].[Article] ([id], [title], [imagePath], [fullContent], [shortContent]) VALUES (11, N'18 types of sushi rolls', N'sushi.jpg', N'At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga. Et harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum soluta nobis est eligendi optio cumque nihil impedit quo minus id quod maxime placeat facere possimus, omnis voluptas assumenda est, omnis dolor repellendus. Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe eveniet ut et voluptates repudiandae sint et molestiae non recusandae. Itaque earum rerum hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus maiores alias consequatur aut perferendis doloribus asperiores repellat."', N't harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum soluta nobis est eligendi optio cumque nihil impedit quo minus id quod maxime placeat facere possimus, omnis voluptas assumenda est, omnis dolor repellendus.')
SET IDENTITY_INSERT [dbo].[Article] OFF
