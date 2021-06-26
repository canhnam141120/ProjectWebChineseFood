SELECT DISTINCT tb.accountid, tb.password, tb.groupname From 
(SELECT a.accountid,a.password,g.groupid,g.groupname FROM 
Account a INNER JOIN Group_Account ga 
ON a.accountid = ga.accountid 
INNER JOIN [Group] g ON g.groupid = ga.groupid
INNER JOIN [Group_Functionality] gf ON gf.groupid = g.groupid
INNER JOIN Functionality f ON gf.functionid = f.functionid
) as tb

USE [ChineseShop]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 11/10/2020 9:29:01 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[accountid] [varchar](50) NOT NULL,
	[password] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Account] PRIMARY KEY CLUSTERED 
(
	[accountid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Functionality]    Script Date: 11/10/2020 9:29:01 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Functionality](
	[functionid] [int] NOT NULL,
	[url] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Functionality] PRIMARY KEY CLUSTERED 
(
	[functionid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Group]    Script Date: 11/10/2020 9:29:01 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Group](
	[groupid] [int] NOT NULL,
	[groupname] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Group] PRIMARY KEY CLUSTERED 
(
	[groupid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Group_Account]    Script Date: 11/10/2020 9:29:01 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Group_Account](
	[accountid] [varchar](50) NOT NULL,
	[groupid] [int] NOT NULL,
 CONSTRAINT [PK_Group_Account] PRIMARY KEY CLUSTERED 
(
	[accountid] ASC,
	[groupid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Group_Functionality]    Script Date: 11/10/2020 9:29:01 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Group_Functionality](
	[groupid] [int] NOT NULL,
	[functionid] [int] NOT NULL,
 CONSTRAINT [PK_Group_Functionality] PRIMARY KEY CLUSTERED 
(
	[groupid] ASC,
	[functionid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Group_Product]    Script Date: 11/10/2020 9:29:01 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Group_Product](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[group] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Group_Product] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Product]    Script Date: 11/10/2020 9:29:01 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Product](
	[itemID] [int] IDENTITY(1,1) NOT NULL,
	[itemName] [varchar](50) NOT NULL,
	[description] [varchar](max) NOT NULL,
	[image] [varchar](50) NOT NULL,
	[itemRate] [int] NOT NULL,
	[price] [real] NOT NULL,
	[itemStatus] [bit] NOT NULL,
	[menuID] [int] NOT NULL,
 CONSTRAINT [PK_Product] PRIMARY KEY CLUSTERED 
(
	[itemID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
INSERT [dbo].[Account] ([accountid], [password]) VALUES (N'admin', N'123')
INSERT [dbo].[Account] ([accountid], [password]) VALUES (N'guess', N'123')
INSERT [dbo].[Account] ([accountid], [password]) VALUES (N'member', N'123')
GO
INSERT [dbo].[Functionality] ([functionid], [url]) VALUES (1, N'/updateproduct')
INSERT [dbo].[Functionality] ([functionid], [url]) VALUES (2, N'/delete')
INSERT [dbo].[Functionality] ([functionid], [url]) VALUES (3, N'/addproduct')
INSERT [dbo].[Functionality] ([functionid], [url]) VALUES (4, N'/List')
INSERT [dbo].[Functionality] ([functionid], [url]) VALUES (5, N'/product-single')
GO
INSERT [dbo].[Group] ([groupid], [groupname]) VALUES (1, N'admin')
INSERT [dbo].[Group] ([groupid], [groupname]) VALUES (2, N'mod')
INSERT [dbo].[Group] ([groupid], [groupname]) VALUES (3, N'member')
GO
INSERT [dbo].[Group_Account] ([accountid], [groupid]) VALUES (N'admin', 1)
INSERT [dbo].[Group_Account] ([accountid], [groupid]) VALUES (N'guess', 3)
INSERT [dbo].[Group_Account] ([accountid], [groupid]) VALUES (N'member', 2)
GO
INSERT [dbo].[Group_Functionality] ([groupid], [functionid]) VALUES (1, 1)
INSERT [dbo].[Group_Functionality] ([groupid], [functionid]) VALUES (1, 2)
INSERT [dbo].[Group_Functionality] ([groupid], [functionid]) VALUES (1, 3)
INSERT [dbo].[Group_Functionality] ([groupid], [functionid]) VALUES (1, 4)
INSERT [dbo].[Group_Functionality] ([groupid], [functionid]) VALUES (1, 5)
INSERT [dbo].[Group_Functionality] ([groupid], [functionid]) VALUES (2, 1)
INSERT [dbo].[Group_Functionality] ([groupid], [functionid]) VALUES (2, 4)
INSERT [dbo].[Group_Functionality] ([groupid], [functionid]) VALUES (2, 5)
INSERT [dbo].[Group_Functionality] ([groupid], [functionid]) VALUES (3, 4)
INSERT [dbo].[Group_Functionality] ([groupid], [functionid]) VALUES (3, 5)
GO
SET IDENTITY_INSERT [dbo].[Group_Product] ON 

INSERT [dbo].[Group_Product] ([id], [group]) VALUES (1, N'Spicy sticks')
INSERT [dbo].[Group_Product] ([id], [group]) VALUES (2, N'Snacks')
INSERT [dbo].[Group_Product] ([id], [group]) VALUES (3, N'Drinks')
INSERT [dbo].[Group_Product] ([id], [group]) VALUES (4, N'Instant food')
SET IDENTITY_INSERT [dbo].[Group_Product] OFF
GO
SET IDENTITY_INSERT [dbo].[Product] ON 

INSERT [dbo].[Product] ([itemID], [itemName], [description], [image], [itemRate], [price], [itemStatus], [menuID]) VALUES (1, N'Chicken taste', N'Beijing roast chicken flavorful sticks are delicious and nutritious.', N'images/product-1.jpg', 0, 120, 1, 1)
INSERT [dbo].[Product] ([itemID], [itemName], [description], [image], [itemRate], [price], [itemStatus], [menuID]) VALUES (3, N'Chicken wings snack', N'Chicken wings snack with super delicious spices, super crispy, not bored.', N'images/product-3.jpg', 5, 120, 1, 2)
INSERT [dbo].[Product] ([itemID], [itemName], [description], [image], [itemRate], [price], [itemStatus], [menuID]) VALUES (4, N'Beef taste', N'The spicy beef flavor from Yunnan, China is a famous specialty with the rich and sweet taste of beef.', N'images/product-4.jpg', 5, 120, 1, 1)
INSERT [dbo].[Product] ([itemID], [itemName], [description], [image], [itemRate], [price], [itemStatus], [menuID]) VALUES (5, N'Crunchy biscuits', N'Crispy crackers are super crispy, sweet, creamy and chocolate mingle.', N'images/product-5.jpg', 5, 120, 1, 2)
INSERT [dbo].[Product] ([itemID], [itemName], [description], [image], [itemRate], [price], [itemStatus], [menuID]) VALUES (6, N'Squid taste', N'The spicy squid taste from the waters of Guangdong is super spicy and chewy with the taste of the sea.', N'images/product-6.jpg', 5, 120, 1, 1)
INSERT [dbo].[Product] ([itemID], [itemName], [description], [image], [itemRate], [price], [itemStatus], [menuID]) VALUES (7, N'Duck taste', N'Beijing roast duck super spicy and delicious stick super delicious to eat forever.', N'images/product-7.jpg', 0, 200, 1, 1)
INSERT [dbo].[Product] ([itemID], [itemName], [description], [image], [itemRate], [price], [itemStatus], [menuID]) VALUES (8, N'Rio drinks', N'A famous Chinese drink is sought after by the young Vietnamese.', N'images/product-8.jpg', 0, 170, 1, 3)
INSERT [dbo].[Product] ([itemID], [itemName], [description], [image], [itemRate], [price], [itemStatus], [menuID]) VALUES (11, N'Self-boiled hot pot', N'The hotpot itself boils with the ability to self-boil after adding water to a dedicated self-boiling package to heat and cook food and enjoy crickets anytime, anywhere.', N'images/product-9.jpg', 0, 200, 1, 4)
INSERT [dbo].[Product] ([itemID], [itemName], [description], [image], [itemRate], [price], [itemStatus], [menuID]) VALUES (12, N'Squid snack', N'The squid snack is super crispy and fragrant with the squid flavor of the Chinese seas. ', N'images/product-2.jpg', 0, 190, 1, 2)
SET IDENTITY_INSERT [dbo].[Product] OFF
GO
