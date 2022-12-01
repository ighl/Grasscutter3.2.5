// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class ShopOuterClass
{
    private static final Descriptors.Descriptor internal_static_Shop_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Shop_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ShopOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ShopOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\nShop.proto\u001a\u0015ShopCardProduct.proto\u001a\u0018ShopConcertProduct.proto\u001a\u000fShopGoods.proto\u001a\u0016ShopMcoinProduct.proto\"\u00e6\u0001\n\u0004Shop\u00121\n\u0014concert_product_list\u0018\u0003 \u0003(\u000b2\u0013.ShopConcertProduct\u0012\u001e\n\ngoods_list\u0018\u000f \u0003(\u000b2\n.ShopGoods\u0012\u001d\n\u0015city_reputation_level\u0018\u0004 \u0001(\r\u0012-\n\u0012mcoin_product_list\u0018\u0007 \u0003(\u000b2\u0011.ShopMcoinProduct\u0012\u0019\n\u0011next_refresh_time\u0018\u0001 \u0001(\r\u0012\u000f\n\u0007city_id\u0018\u000e \u0001(\r\u0012\u0011\n\tshop_type\u0018\r \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ShopOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ShopCardProductOuterClass.getDescriptor(), ShopConcertProductOuterClass.getDescriptor(), ShopGoodsOuterClass.getDescriptor(), ShopMcoinProductOuterClass.getDescriptor() });
        internal_static_Shop_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_Shop_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ShopOuterClass.internal_static_Shop_descriptor, new String[] { "ConcertProductList", "GoodsList", "CityReputationLevel", "McoinProductList", "NextRefreshTime", "CityId", "ShopType" });
        ShopCardProductOuterClass.getDescriptor();
        ShopConcertProductOuterClass.getDescriptor();
        ShopGoodsOuterClass.getDescriptor();
        ShopMcoinProductOuterClass.getDescriptor();
    }
    
    public static final class Shop extends GeneratedMessageV3 implements ShopOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int CONCERT_PRODUCT_LIST_FIELD_NUMBER = 3;
        private List<ShopConcertProductOuterClass.ShopConcertProduct> concertProductList_;
        public static final int GOODS_LIST_FIELD_NUMBER = 15;
        private List<ShopGoodsOuterClass.ShopGoods> goodsList_;
        public static final int CITY_REPUTATION_LEVEL_FIELD_NUMBER = 4;
        private int cityReputationLevel_;
        public static final int MCOIN_PRODUCT_LIST_FIELD_NUMBER = 7;
        private List<ShopMcoinProductOuterClass.ShopMcoinProduct> mcoinProductList_;
        public static final int NEXT_REFRESH_TIME_FIELD_NUMBER = 1;
        private int nextRefreshTime_;
        public static final int CITY_ID_FIELD_NUMBER = 14;
        private int cityId_;
        public static final int SHOP_TYPE_FIELD_NUMBER = 13;
        private int shopType_;
        private byte memoizedIsInitialized;
        private static final Shop DEFAULT_INSTANCE;
        private static final Parser<Shop> PARSER;
        
        private Shop(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private Shop() {
            this.memoizedIsInitialized = -1;
            this.concertProductList_ = Collections.emptyList();
            this.goodsList_ = Collections.emptyList();
            this.mcoinProductList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new Shop();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private Shop(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            int mutable_bitField0_ = 0;
            final UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    final int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue;
                        }
                        case 8: {
                            this.nextRefreshTime_ = input.readUInt32();
                            continue;
                        }
                        case 26: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.concertProductList_ = new ArrayList<ShopConcertProductOuterClass.ShopConcertProduct>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.concertProductList_.add(input.readMessage(ShopConcertProductOuterClass.ShopConcertProduct.parser(), extensionRegistry));
                            continue;
                        }
                        case 32: {
                            this.cityReputationLevel_ = input.readUInt32();
                            continue;
                        }
                        case 58: {
                            if ((mutable_bitField0_ & 0x4) == 0x0) {
                                this.mcoinProductList_ = new ArrayList<ShopMcoinProductOuterClass.ShopMcoinProduct>();
                                mutable_bitField0_ |= 0x4;
                            }
                            this.mcoinProductList_.add(input.readMessage(ShopMcoinProductOuterClass.ShopMcoinProduct.parser(), extensionRegistry));
                            continue;
                        }
                        case 104: {
                            this.shopType_ = input.readUInt32();
                            continue;
                        }
                        case 112: {
                            this.cityId_ = input.readUInt32();
                            continue;
                        }
                        case 122: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.goodsList_ = new ArrayList<ShopGoodsOuterClass.ShopGoods>();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.goodsList_.add(input.readMessage(ShopGoodsOuterClass.ShopGoods.parser(), extensionRegistry));
                            continue;
                        }
                        default: {
                            if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                                continue;
                            }
                            continue;
                        }
                    }
                }
            }
            catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            }
            catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
            }
            finally {
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.concertProductList_ = Collections.unmodifiableList((List<? extends ShopConcertProductOuterClass.ShopConcertProduct>)this.concertProductList_);
                }
                if ((mutable_bitField0_ & 0x4) != 0x0) {
                    this.mcoinProductList_ = Collections.unmodifiableList((List<? extends ShopMcoinProductOuterClass.ShopMcoinProduct>)this.mcoinProductList_);
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.goodsList_ = Collections.unmodifiableList((List<? extends ShopGoodsOuterClass.ShopGoods>)this.goodsList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return ShopOuterClass.internal_static_Shop_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ShopOuterClass.internal_static_Shop_fieldAccessorTable.ensureFieldAccessorsInitialized(Shop.class, Builder.class);
        }
        
        @Override
        public List<ShopConcertProductOuterClass.ShopConcertProduct> getConcertProductListList() {
            return this.concertProductList_;
        }
        
        @Override
        public List<? extends ShopConcertProductOuterClass.ShopConcertProductOrBuilder> getConcertProductListOrBuilderList() {
            return this.concertProductList_;
        }
        
        @Override
        public int getConcertProductListCount() {
            return this.concertProductList_.size();
        }
        
        @Override
        public ShopConcertProductOuterClass.ShopConcertProduct getConcertProductList(final int index) {
            return this.concertProductList_.get(index);
        }
        
        @Override
        public ShopConcertProductOuterClass.ShopConcertProductOrBuilder getConcertProductListOrBuilder(final int index) {
            return this.concertProductList_.get(index);
        }
        
        @Override
        public List<ShopGoodsOuterClass.ShopGoods> getGoodsListList() {
            return this.goodsList_;
        }
        
        @Override
        public List<? extends ShopGoodsOuterClass.ShopGoodsOrBuilder> getGoodsListOrBuilderList() {
            return this.goodsList_;
        }
        
        @Override
        public int getGoodsListCount() {
            return this.goodsList_.size();
        }
        
        @Override
        public ShopGoodsOuterClass.ShopGoods getGoodsList(final int index) {
            return this.goodsList_.get(index);
        }
        
        @Override
        public ShopGoodsOuterClass.ShopGoodsOrBuilder getGoodsListOrBuilder(final int index) {
            return this.goodsList_.get(index);
        }
        
        @Override
        public int getCityReputationLevel() {
            return this.cityReputationLevel_;
        }
        
        @Override
        public List<ShopMcoinProductOuterClass.ShopMcoinProduct> getMcoinProductListList() {
            return this.mcoinProductList_;
        }
        
        @Override
        public List<? extends ShopMcoinProductOuterClass.ShopMcoinProductOrBuilder> getMcoinProductListOrBuilderList() {
            return this.mcoinProductList_;
        }
        
        @Override
        public int getMcoinProductListCount() {
            return this.mcoinProductList_.size();
        }
        
        @Override
        public ShopMcoinProductOuterClass.ShopMcoinProduct getMcoinProductList(final int index) {
            return this.mcoinProductList_.get(index);
        }
        
        @Override
        public ShopMcoinProductOuterClass.ShopMcoinProductOrBuilder getMcoinProductListOrBuilder(final int index) {
            return this.mcoinProductList_.get(index);
        }
        
        @Override
        public int getNextRefreshTime() {
            return this.nextRefreshTime_;
        }
        
        @Override
        public int getCityId() {
            return this.cityId_;
        }
        
        @Override
        public int getShopType() {
            return this.shopType_;
        }
        
        @Override
        public final boolean isInitialized() {
            final byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }
        
        @Override
        public void writeTo(final CodedOutputStream output) throws IOException {
            if (this.nextRefreshTime_ != 0) {
                output.writeUInt32(1, this.nextRefreshTime_);
            }
            for (int i = 0; i < this.concertProductList_.size(); ++i) {
                output.writeMessage(3, this.concertProductList_.get(i));
            }
            if (this.cityReputationLevel_ != 0) {
                output.writeUInt32(4, this.cityReputationLevel_);
            }
            for (int i = 0; i < this.mcoinProductList_.size(); ++i) {
                output.writeMessage(7, this.mcoinProductList_.get(i));
            }
            if (this.shopType_ != 0) {
                output.writeUInt32(13, this.shopType_);
            }
            if (this.cityId_ != 0) {
                output.writeUInt32(14, this.cityId_);
            }
            for (int i = 0; i < this.goodsList_.size(); ++i) {
                output.writeMessage(15, this.goodsList_.get(i));
            }
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if (this.nextRefreshTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.nextRefreshTime_);
            }
            for (int i = 0; i < this.concertProductList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(3, this.concertProductList_.get(i));
            }
            if (this.cityReputationLevel_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.cityReputationLevel_);
            }
            for (int i = 0; i < this.mcoinProductList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(7, this.mcoinProductList_.get(i));
            }
            if (this.shopType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.shopType_);
            }
            if (this.cityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(14, this.cityId_);
            }
            for (int i = 0; i < this.goodsList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(15, this.goodsList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Shop)) {
                return super.equals(obj);
            }
            final Shop other = (Shop)obj;
            return this.getConcertProductListList().equals(other.getConcertProductListList()) && this.getGoodsListList().equals(other.getGoodsListList()) && this.getCityReputationLevel() == other.getCityReputationLevel() && this.getMcoinProductListList().equals(other.getMcoinProductListList()) && this.getNextRefreshTime() == other.getNextRefreshTime() && this.getCityId() == other.getCityId() && this.getShopType() == other.getShopType() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getConcertProductListCount() > 0) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getConcertProductListList().hashCode();
            }
            if (this.getGoodsListCount() > 0) {
                hash = 37 * hash + 15;
                hash = 53 * hash + this.getGoodsListList().hashCode();
            }
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getCityReputationLevel();
            if (this.getMcoinProductListCount() > 0) {
                hash = 37 * hash + 7;
                hash = 53 * hash + this.getMcoinProductListList().hashCode();
            }
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getNextRefreshTime();
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getCityId();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getShopType();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static Shop parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return Shop.PARSER.parseFrom(data);
        }
        
        public static Shop parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Shop.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Shop parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return Shop.PARSER.parseFrom(data);
        }
        
        public static Shop parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Shop.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Shop parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return Shop.PARSER.parseFrom(data);
        }
        
        public static Shop parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Shop.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Shop parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Shop.PARSER, input);
        }
        
        public static Shop parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Shop.PARSER, input, extensionRegistry);
        }
        
        public static Shop parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Shop.PARSER, input);
        }
        
        public static Shop parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Shop.PARSER, input, extensionRegistry);
        }
        
        public static Shop parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Shop.PARSER, input);
        }
        
        public static Shop parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Shop.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return Shop.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final Shop prototype) {
            return Shop.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == Shop.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static Shop getDefaultInstance() {
            return Shop.DEFAULT_INSTANCE;
        }
        
        public static Parser<Shop> parser() {
            return Shop.PARSER;
        }
        
        @Override
        public Parser<Shop> getParserForType() {
            return Shop.PARSER;
        }
        
        @Override
        public Shop getDefaultInstanceForType() {
            return Shop.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new Shop();
            PARSER = new AbstractParser<Shop>() {
                @Override
                public Shop parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new Shop(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ShopOrBuilder
        {
            private int bitField0_;
            private List<ShopConcertProductOuterClass.ShopConcertProduct> concertProductList_;
            private RepeatedFieldBuilderV3<ShopConcertProductOuterClass.ShopConcertProduct, ShopConcertProductOuterClass.ShopConcertProduct.Builder, ShopConcertProductOuterClass.ShopConcertProductOrBuilder> concertProductListBuilder_;
            private List<ShopGoodsOuterClass.ShopGoods> goodsList_;
            private RepeatedFieldBuilderV3<ShopGoodsOuterClass.ShopGoods, ShopGoodsOuterClass.ShopGoods.Builder, ShopGoodsOuterClass.ShopGoodsOrBuilder> goodsListBuilder_;
            private int cityReputationLevel_;
            private List<ShopMcoinProductOuterClass.ShopMcoinProduct> mcoinProductList_;
            private RepeatedFieldBuilderV3<ShopMcoinProductOuterClass.ShopMcoinProduct, ShopMcoinProductOuterClass.ShopMcoinProduct.Builder, ShopMcoinProductOuterClass.ShopMcoinProductOrBuilder> mcoinProductListBuilder_;
            private int nextRefreshTime_;
            private int cityId_;
            private int shopType_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ShopOuterClass.internal_static_Shop_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ShopOuterClass.internal_static_Shop_fieldAccessorTable.ensureFieldAccessorsInitialized(Shop.class, Builder.class);
            }
            
            private Builder() {
                this.concertProductList_ = Collections.emptyList();
                this.goodsList_ = Collections.emptyList();
                this.mcoinProductList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.concertProductList_ = Collections.emptyList();
                this.goodsList_ = Collections.emptyList();
                this.mcoinProductList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (Shop.alwaysUseFieldBuilders) {
                    this.getConcertProductListFieldBuilder();
                    this.getGoodsListFieldBuilder();
                    this.getMcoinProductListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.concertProductListBuilder_ == null) {
                    this.concertProductList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.concertProductListBuilder_.clear();
                }
                if (this.goodsListBuilder_ == null) {
                    this.goodsList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                else {
                    this.goodsListBuilder_.clear();
                }
                this.cityReputationLevel_ = 0;
                if (this.mcoinProductListBuilder_ == null) {
                    this.mcoinProductList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                }
                else {
                    this.mcoinProductListBuilder_.clear();
                }
                this.nextRefreshTime_ = 0;
                this.cityId_ = 0;
                this.shopType_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ShopOuterClass.internal_static_Shop_descriptor;
            }
            
            @Override
            public Shop getDefaultInstanceForType() {
                return Shop.getDefaultInstance();
            }
            
            @Override
            public Shop build() {
                final Shop result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public Shop buildPartial() {
                final Shop result = new Shop(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.concertProductListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.concertProductList_ = Collections.unmodifiableList((List<? extends ShopConcertProductOuterClass.ShopConcertProduct>)this.concertProductList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.concertProductList_ = this.concertProductList_;
                }
                else {
                    result.concertProductList_ = this.concertProductListBuilder_.build();
                }
                if (this.goodsListBuilder_ == null) {
                    if ((this.bitField0_ & 0x2) != 0x0) {
                        this.goodsList_ = Collections.unmodifiableList((List<? extends ShopGoodsOuterClass.ShopGoods>)this.goodsList_);
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    result.goodsList_ = this.goodsList_;
                }
                else {
                    result.goodsList_ = this.goodsListBuilder_.build();
                }
                result.cityReputationLevel_ = this.cityReputationLevel_;
                if (this.mcoinProductListBuilder_ == null) {
                    if ((this.bitField0_ & 0x4) != 0x0) {
                        this.mcoinProductList_ = Collections.unmodifiableList((List<? extends ShopMcoinProductOuterClass.ShopMcoinProduct>)this.mcoinProductList_);
                        this.bitField0_ &= 0xFFFFFFFB;
                    }
                    result.mcoinProductList_ = this.mcoinProductList_;
                }
                else {
                    result.mcoinProductList_ = this.mcoinProductListBuilder_.build();
                }
                result.nextRefreshTime_ = this.nextRefreshTime_;
                result.cityId_ = this.cityId_;
                result.shopType_ = this.shopType_;
                this.onBuilt();
                return result;
            }
            
            @Override
            public Builder clone() {
                return super.clone();
            }
            
            @Override
            public Builder setField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.setField(field, value);
            }
            
            @Override
            public Builder clearField(final Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            
            @Override
            public Builder clearOneof(final Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            
            @Override
            public Builder setRepeatedField(final Descriptors.FieldDescriptor field, final int index, final Object value) {
                return super.setRepeatedField(field, index, value);
            }
            
            @Override
            public Builder addRepeatedField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.addRepeatedField(field, value);
            }
            
            @Override
            public Builder mergeFrom(final Message other) {
                if (other instanceof Shop) {
                    return this.mergeFrom((Shop)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final Shop other) {
                if (other == Shop.getDefaultInstance()) {
                    return this;
                }
                if (this.concertProductListBuilder_ == null) {
                    if (!other.concertProductList_.isEmpty()) {
                        if (this.concertProductList_.isEmpty()) {
                            this.concertProductList_ = other.concertProductList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureConcertProductListIsMutable();
                            this.concertProductList_.addAll(other.concertProductList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.concertProductList_.isEmpty()) {
                    if (this.concertProductListBuilder_.isEmpty()) {
                        this.concertProductListBuilder_.dispose();
                        this.concertProductListBuilder_ = null;
                        this.concertProductList_ = other.concertProductList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.concertProductListBuilder_ = (Shop.alwaysUseFieldBuilders ? this.getConcertProductListFieldBuilder() : null);
                    }
                    else {
                        this.concertProductListBuilder_.addAllMessages(other.concertProductList_);
                    }
                }
                if (this.goodsListBuilder_ == null) {
                    if (!other.goodsList_.isEmpty()) {
                        if (this.goodsList_.isEmpty()) {
                            this.goodsList_ = other.goodsList_;
                            this.bitField0_ &= 0xFFFFFFFD;
                        }
                        else {
                            this.ensureGoodsListIsMutable();
                            this.goodsList_.addAll(other.goodsList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.goodsList_.isEmpty()) {
                    if (this.goodsListBuilder_.isEmpty()) {
                        this.goodsListBuilder_.dispose();
                        this.goodsListBuilder_ = null;
                        this.goodsList_ = other.goodsList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                        this.goodsListBuilder_ = (Shop.alwaysUseFieldBuilders ? this.getGoodsListFieldBuilder() : null);
                    }
                    else {
                        this.goodsListBuilder_.addAllMessages(other.goodsList_);
                    }
                }
                if (other.getCityReputationLevel() != 0) {
                    this.setCityReputationLevel(other.getCityReputationLevel());
                }
                if (this.mcoinProductListBuilder_ == null) {
                    if (!other.mcoinProductList_.isEmpty()) {
                        if (this.mcoinProductList_.isEmpty()) {
                            this.mcoinProductList_ = other.mcoinProductList_;
                            this.bitField0_ &= 0xFFFFFFFB;
                        }
                        else {
                            this.ensureMcoinProductListIsMutable();
                            this.mcoinProductList_.addAll(other.mcoinProductList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.mcoinProductList_.isEmpty()) {
                    if (this.mcoinProductListBuilder_.isEmpty()) {
                        this.mcoinProductListBuilder_.dispose();
                        this.mcoinProductListBuilder_ = null;
                        this.mcoinProductList_ = other.mcoinProductList_;
                        this.bitField0_ &= 0xFFFFFFFB;
                        this.mcoinProductListBuilder_ = (Shop.alwaysUseFieldBuilders ? this.getMcoinProductListFieldBuilder() : null);
                    }
                    else {
                        this.mcoinProductListBuilder_.addAllMessages(other.mcoinProductList_);
                    }
                }
                if (other.getNextRefreshTime() != 0) {
                    this.setNextRefreshTime(other.getNextRefreshTime());
                }
                if (other.getCityId() != 0) {
                    this.setCityId(other.getCityId());
                }
                if (other.getShopType() != 0) {
                    this.setShopType(other.getShopType());
                }
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }
            
            @Override
            public final boolean isInitialized() {
                return true;
            }
            
            @Override
            public Builder mergeFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                Shop parsedMessage = null;
                try {
                    parsedMessage = Shop.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (Shop)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureConcertProductListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.concertProductList_ = new ArrayList<ShopConcertProductOuterClass.ShopConcertProduct>(this.concertProductList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<ShopConcertProductOuterClass.ShopConcertProduct> getConcertProductListList() {
                if (this.concertProductListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ShopConcertProductOuterClass.ShopConcertProduct>)this.concertProductList_);
                }
                return this.concertProductListBuilder_.getMessageList();
            }
            
            @Override
            public int getConcertProductListCount() {
                if (this.concertProductListBuilder_ == null) {
                    return this.concertProductList_.size();
                }
                return this.concertProductListBuilder_.getCount();
            }
            
            @Override
            public ShopConcertProductOuterClass.ShopConcertProduct getConcertProductList(final int index) {
                if (this.concertProductListBuilder_ == null) {
                    return this.concertProductList_.get(index);
                }
                return this.concertProductListBuilder_.getMessage(index);
            }
            
            public Builder setConcertProductList(final int index, final ShopConcertProductOuterClass.ShopConcertProduct value) {
                if (this.concertProductListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureConcertProductListIsMutable();
                    this.concertProductList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.concertProductListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setConcertProductList(final int index, final ShopConcertProductOuterClass.ShopConcertProduct.Builder builderForValue) {
                if (this.concertProductListBuilder_ == null) {
                    this.ensureConcertProductListIsMutable();
                    this.concertProductList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.concertProductListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addConcertProductList(final ShopConcertProductOuterClass.ShopConcertProduct value) {
                if (this.concertProductListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureConcertProductListIsMutable();
                    this.concertProductList_.add(value);
                    this.onChanged();
                }
                else {
                    this.concertProductListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addConcertProductList(final int index, final ShopConcertProductOuterClass.ShopConcertProduct value) {
                if (this.concertProductListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureConcertProductListIsMutable();
                    this.concertProductList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.concertProductListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addConcertProductList(final ShopConcertProductOuterClass.ShopConcertProduct.Builder builderForValue) {
                if (this.concertProductListBuilder_ == null) {
                    this.ensureConcertProductListIsMutable();
                    this.concertProductList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.concertProductListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addConcertProductList(final int index, final ShopConcertProductOuterClass.ShopConcertProduct.Builder builderForValue) {
                if (this.concertProductListBuilder_ == null) {
                    this.ensureConcertProductListIsMutable();
                    this.concertProductList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.concertProductListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllConcertProductList(final Iterable<? extends ShopConcertProductOuterClass.ShopConcertProduct> values) {
                if (this.concertProductListBuilder_ == null) {
                    this.ensureConcertProductListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.concertProductList_);
                    this.onChanged();
                }
                else {
                    this.concertProductListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearConcertProductList() {
                if (this.concertProductListBuilder_ == null) {
                    this.concertProductList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.concertProductListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeConcertProductList(final int index) {
                if (this.concertProductListBuilder_ == null) {
                    this.ensureConcertProductListIsMutable();
                    this.concertProductList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.concertProductListBuilder_.remove(index);
                }
                return this;
            }
            
            public ShopConcertProductOuterClass.ShopConcertProduct.Builder getConcertProductListBuilder(final int index) {
                return this.getConcertProductListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ShopConcertProductOuterClass.ShopConcertProductOrBuilder getConcertProductListOrBuilder(final int index) {
                if (this.concertProductListBuilder_ == null) {
                    return this.concertProductList_.get(index);
                }
                return this.concertProductListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ShopConcertProductOuterClass.ShopConcertProductOrBuilder> getConcertProductListOrBuilderList() {
                if (this.concertProductListBuilder_ != null) {
                    return this.concertProductListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ShopConcertProductOuterClass.ShopConcertProductOrBuilder>)this.concertProductList_);
            }
            
            public ShopConcertProductOuterClass.ShopConcertProduct.Builder addConcertProductListBuilder() {
                return this.getConcertProductListFieldBuilder().addBuilder(ShopConcertProductOuterClass.ShopConcertProduct.getDefaultInstance());
            }
            
            public ShopConcertProductOuterClass.ShopConcertProduct.Builder addConcertProductListBuilder(final int index) {
                return this.getConcertProductListFieldBuilder().addBuilder(index, ShopConcertProductOuterClass.ShopConcertProduct.getDefaultInstance());
            }
            
            public List<ShopConcertProductOuterClass.ShopConcertProduct.Builder> getConcertProductListBuilderList() {
                return this.getConcertProductListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ShopConcertProductOuterClass.ShopConcertProduct, ShopConcertProductOuterClass.ShopConcertProduct.Builder, ShopConcertProductOuterClass.ShopConcertProductOrBuilder> getConcertProductListFieldBuilder() {
                if (this.concertProductListBuilder_ == null) {
                    this.concertProductListBuilder_ = new RepeatedFieldBuilderV3<ShopConcertProductOuterClass.ShopConcertProduct, ShopConcertProductOuterClass.ShopConcertProduct.Builder, ShopConcertProductOuterClass.ShopConcertProductOrBuilder>(this.concertProductList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.concertProductList_ = null;
                }
                return this.concertProductListBuilder_;
            }
            
            private void ensureGoodsListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.goodsList_ = new ArrayList<ShopGoodsOuterClass.ShopGoods>(this.goodsList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<ShopGoodsOuterClass.ShopGoods> getGoodsListList() {
                if (this.goodsListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ShopGoodsOuterClass.ShopGoods>)this.goodsList_);
                }
                return this.goodsListBuilder_.getMessageList();
            }
            
            @Override
            public int getGoodsListCount() {
                if (this.goodsListBuilder_ == null) {
                    return this.goodsList_.size();
                }
                return this.goodsListBuilder_.getCount();
            }
            
            @Override
            public ShopGoodsOuterClass.ShopGoods getGoodsList(final int index) {
                if (this.goodsListBuilder_ == null) {
                    return this.goodsList_.get(index);
                }
                return this.goodsListBuilder_.getMessage(index);
            }
            
            public Builder setGoodsList(final int index, final ShopGoodsOuterClass.ShopGoods value) {
                if (this.goodsListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureGoodsListIsMutable();
                    this.goodsList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.goodsListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setGoodsList(final int index, final ShopGoodsOuterClass.ShopGoods.Builder builderForValue) {
                if (this.goodsListBuilder_ == null) {
                    this.ensureGoodsListIsMutable();
                    this.goodsList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.goodsListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addGoodsList(final ShopGoodsOuterClass.ShopGoods value) {
                if (this.goodsListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureGoodsListIsMutable();
                    this.goodsList_.add(value);
                    this.onChanged();
                }
                else {
                    this.goodsListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addGoodsList(final int index, final ShopGoodsOuterClass.ShopGoods value) {
                if (this.goodsListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureGoodsListIsMutable();
                    this.goodsList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.goodsListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addGoodsList(final ShopGoodsOuterClass.ShopGoods.Builder builderForValue) {
                if (this.goodsListBuilder_ == null) {
                    this.ensureGoodsListIsMutable();
                    this.goodsList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.goodsListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addGoodsList(final int index, final ShopGoodsOuterClass.ShopGoods.Builder builderForValue) {
                if (this.goodsListBuilder_ == null) {
                    this.ensureGoodsListIsMutable();
                    this.goodsList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.goodsListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllGoodsList(final Iterable<? extends ShopGoodsOuterClass.ShopGoods> values) {
                if (this.goodsListBuilder_ == null) {
                    this.ensureGoodsListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.goodsList_);
                    this.onChanged();
                }
                else {
                    this.goodsListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearGoodsList() {
                if (this.goodsListBuilder_ == null) {
                    this.goodsList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                    this.onChanged();
                }
                else {
                    this.goodsListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeGoodsList(final int index) {
                if (this.goodsListBuilder_ == null) {
                    this.ensureGoodsListIsMutable();
                    this.goodsList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.goodsListBuilder_.remove(index);
                }
                return this;
            }
            
            public ShopGoodsOuterClass.ShopGoods.Builder getGoodsListBuilder(final int index) {
                return this.getGoodsListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ShopGoodsOuterClass.ShopGoodsOrBuilder getGoodsListOrBuilder(final int index) {
                if (this.goodsListBuilder_ == null) {
                    return this.goodsList_.get(index);
                }
                return this.goodsListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ShopGoodsOuterClass.ShopGoodsOrBuilder> getGoodsListOrBuilderList() {
                if (this.goodsListBuilder_ != null) {
                    return this.goodsListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ShopGoodsOuterClass.ShopGoodsOrBuilder>)this.goodsList_);
            }
            
            public ShopGoodsOuterClass.ShopGoods.Builder addGoodsListBuilder() {
                return this.getGoodsListFieldBuilder().addBuilder(ShopGoodsOuterClass.ShopGoods.getDefaultInstance());
            }
            
            public ShopGoodsOuterClass.ShopGoods.Builder addGoodsListBuilder(final int index) {
                return this.getGoodsListFieldBuilder().addBuilder(index, ShopGoodsOuterClass.ShopGoods.getDefaultInstance());
            }
            
            public List<ShopGoodsOuterClass.ShopGoods.Builder> getGoodsListBuilderList() {
                return this.getGoodsListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ShopGoodsOuterClass.ShopGoods, ShopGoodsOuterClass.ShopGoods.Builder, ShopGoodsOuterClass.ShopGoodsOrBuilder> getGoodsListFieldBuilder() {
                if (this.goodsListBuilder_ == null) {
                    this.goodsListBuilder_ = new RepeatedFieldBuilderV3<ShopGoodsOuterClass.ShopGoods, ShopGoodsOuterClass.ShopGoods.Builder, ShopGoodsOuterClass.ShopGoodsOrBuilder>(this.goodsList_, (this.bitField0_ & 0x2) != 0x0, this.getParentForChildren(), this.isClean());
                    this.goodsList_ = null;
                }
                return this.goodsListBuilder_;
            }
            
            @Override
            public int getCityReputationLevel() {
                return this.cityReputationLevel_;
            }
            
            public Builder setCityReputationLevel(final int value) {
                this.cityReputationLevel_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCityReputationLevel() {
                this.cityReputationLevel_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureMcoinProductListIsMutable() {
                if ((this.bitField0_ & 0x4) == 0x0) {
                    this.mcoinProductList_ = new ArrayList<ShopMcoinProductOuterClass.ShopMcoinProduct>(this.mcoinProductList_);
                    this.bitField0_ |= 0x4;
                }
            }
            
            @Override
            public List<ShopMcoinProductOuterClass.ShopMcoinProduct> getMcoinProductListList() {
                if (this.mcoinProductListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ShopMcoinProductOuterClass.ShopMcoinProduct>)this.mcoinProductList_);
                }
                return this.mcoinProductListBuilder_.getMessageList();
            }
            
            @Override
            public int getMcoinProductListCount() {
                if (this.mcoinProductListBuilder_ == null) {
                    return this.mcoinProductList_.size();
                }
                return this.mcoinProductListBuilder_.getCount();
            }
            
            @Override
            public ShopMcoinProductOuterClass.ShopMcoinProduct getMcoinProductList(final int index) {
                if (this.mcoinProductListBuilder_ == null) {
                    return this.mcoinProductList_.get(index);
                }
                return this.mcoinProductListBuilder_.getMessage(index);
            }
            
            public Builder setMcoinProductList(final int index, final ShopMcoinProductOuterClass.ShopMcoinProduct value) {
                if (this.mcoinProductListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureMcoinProductListIsMutable();
                    this.mcoinProductList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.mcoinProductListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setMcoinProductList(final int index, final ShopMcoinProductOuterClass.ShopMcoinProduct.Builder builderForValue) {
                if (this.mcoinProductListBuilder_ == null) {
                    this.ensureMcoinProductListIsMutable();
                    this.mcoinProductList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.mcoinProductListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addMcoinProductList(final ShopMcoinProductOuterClass.ShopMcoinProduct value) {
                if (this.mcoinProductListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureMcoinProductListIsMutable();
                    this.mcoinProductList_.add(value);
                    this.onChanged();
                }
                else {
                    this.mcoinProductListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addMcoinProductList(final int index, final ShopMcoinProductOuterClass.ShopMcoinProduct value) {
                if (this.mcoinProductListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureMcoinProductListIsMutable();
                    this.mcoinProductList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.mcoinProductListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addMcoinProductList(final ShopMcoinProductOuterClass.ShopMcoinProduct.Builder builderForValue) {
                if (this.mcoinProductListBuilder_ == null) {
                    this.ensureMcoinProductListIsMutable();
                    this.mcoinProductList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.mcoinProductListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addMcoinProductList(final int index, final ShopMcoinProductOuterClass.ShopMcoinProduct.Builder builderForValue) {
                if (this.mcoinProductListBuilder_ == null) {
                    this.ensureMcoinProductListIsMutable();
                    this.mcoinProductList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.mcoinProductListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllMcoinProductList(final Iterable<? extends ShopMcoinProductOuterClass.ShopMcoinProduct> values) {
                if (this.mcoinProductListBuilder_ == null) {
                    this.ensureMcoinProductListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.mcoinProductList_);
                    this.onChanged();
                }
                else {
                    this.mcoinProductListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearMcoinProductList() {
                if (this.mcoinProductListBuilder_ == null) {
                    this.mcoinProductList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                    this.onChanged();
                }
                else {
                    this.mcoinProductListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeMcoinProductList(final int index) {
                if (this.mcoinProductListBuilder_ == null) {
                    this.ensureMcoinProductListIsMutable();
                    this.mcoinProductList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.mcoinProductListBuilder_.remove(index);
                }
                return this;
            }
            
            public ShopMcoinProductOuterClass.ShopMcoinProduct.Builder getMcoinProductListBuilder(final int index) {
                return this.getMcoinProductListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ShopMcoinProductOuterClass.ShopMcoinProductOrBuilder getMcoinProductListOrBuilder(final int index) {
                if (this.mcoinProductListBuilder_ == null) {
                    return this.mcoinProductList_.get(index);
                }
                return this.mcoinProductListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ShopMcoinProductOuterClass.ShopMcoinProductOrBuilder> getMcoinProductListOrBuilderList() {
                if (this.mcoinProductListBuilder_ != null) {
                    return this.mcoinProductListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ShopMcoinProductOuterClass.ShopMcoinProductOrBuilder>)this.mcoinProductList_);
            }
            
            public ShopMcoinProductOuterClass.ShopMcoinProduct.Builder addMcoinProductListBuilder() {
                return this.getMcoinProductListFieldBuilder().addBuilder(ShopMcoinProductOuterClass.ShopMcoinProduct.getDefaultInstance());
            }
            
            public ShopMcoinProductOuterClass.ShopMcoinProduct.Builder addMcoinProductListBuilder(final int index) {
                return this.getMcoinProductListFieldBuilder().addBuilder(index, ShopMcoinProductOuterClass.ShopMcoinProduct.getDefaultInstance());
            }
            
            public List<ShopMcoinProductOuterClass.ShopMcoinProduct.Builder> getMcoinProductListBuilderList() {
                return this.getMcoinProductListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ShopMcoinProductOuterClass.ShopMcoinProduct, ShopMcoinProductOuterClass.ShopMcoinProduct.Builder, ShopMcoinProductOuterClass.ShopMcoinProductOrBuilder> getMcoinProductListFieldBuilder() {
                if (this.mcoinProductListBuilder_ == null) {
                    this.mcoinProductListBuilder_ = new RepeatedFieldBuilderV3<ShopMcoinProductOuterClass.ShopMcoinProduct, ShopMcoinProductOuterClass.ShopMcoinProduct.Builder, ShopMcoinProductOuterClass.ShopMcoinProductOrBuilder>(this.mcoinProductList_, (this.bitField0_ & 0x4) != 0x0, this.getParentForChildren(), this.isClean());
                    this.mcoinProductList_ = null;
                }
                return this.mcoinProductListBuilder_;
            }
            
            @Override
            public int getNextRefreshTime() {
                return this.nextRefreshTime_;
            }
            
            public Builder setNextRefreshTime(final int value) {
                this.nextRefreshTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearNextRefreshTime() {
                this.nextRefreshTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCityId() {
                return this.cityId_;
            }
            
            public Builder setCityId(final int value) {
                this.cityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCityId() {
                this.cityId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getShopType() {
                return this.shopType_;
            }
            
            public Builder setShopType(final int value) {
                this.shopType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearShopType() {
                this.shopType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface ShopOrBuilder extends MessageOrBuilder
    {
        List<ShopConcertProductOuterClass.ShopConcertProduct> getConcertProductListList();
        
        ShopConcertProductOuterClass.ShopConcertProduct getConcertProductList(final int p0);
        
        int getConcertProductListCount();
        
        List<? extends ShopConcertProductOuterClass.ShopConcertProductOrBuilder> getConcertProductListOrBuilderList();
        
        ShopConcertProductOuterClass.ShopConcertProductOrBuilder getConcertProductListOrBuilder(final int p0);
        
        List<ShopGoodsOuterClass.ShopGoods> getGoodsListList();
        
        ShopGoodsOuterClass.ShopGoods getGoodsList(final int p0);
        
        int getGoodsListCount();
        
        List<? extends ShopGoodsOuterClass.ShopGoodsOrBuilder> getGoodsListOrBuilderList();
        
        ShopGoodsOuterClass.ShopGoodsOrBuilder getGoodsListOrBuilder(final int p0);
        
        int getCityReputationLevel();
        
        List<ShopMcoinProductOuterClass.ShopMcoinProduct> getMcoinProductListList();
        
        ShopMcoinProductOuterClass.ShopMcoinProduct getMcoinProductList(final int p0);
        
        int getMcoinProductListCount();
        
        List<? extends ShopMcoinProductOuterClass.ShopMcoinProductOrBuilder> getMcoinProductListOrBuilderList();
        
        ShopMcoinProductOuterClass.ShopMcoinProductOrBuilder getMcoinProductListOrBuilder(final int p0);
        
        int getNextRefreshTime();
        
        int getCityId();
        
        int getShopType();
    }
}
