// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Message;
import java.io.InputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ByteString;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class ShopConcertProductOuterClass
{
    private static final Descriptors.Descriptor internal_static_ShopConcertProduct_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ShopConcertProduct_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ShopConcertProductOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ShopConcertProductOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0018ShopConcertProduct.proto\"¡\u0001\n\u0012ShopConcertProduct\u0012\u0012\n\nproduct_id\u0018\u0001 \u0001(\t\u0012\u0012\n\nprice_tier\u0018\u0002 \u0001(\t\u0012\u0014\n\fobtain_count\u0018\u0003 \u0001(\r\u0012\u0014\n\fobtain_limit\u0018\u0004 \u0001(\r\u0012\u0012\n\nbegin_time\u0018\u0005 \u0001(\r\u0012\u0010\n\bend_time\u0018\u0006 \u0001(\r\u0012\u0011\n\tbuy_times\u0018\u0007 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ShopConcertProductOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_ShopConcertProduct_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ShopConcertProduct_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ShopConcertProductOuterClass.internal_static_ShopConcertProduct_descriptor, new String[] { "ProductId", "PriceTier", "ObtainCount", "ObtainLimit", "BeginTime", "EndTime", "BuyTimes" });
    }
    
    public static final class ShopConcertProduct extends GeneratedMessageV3 implements ShopConcertProductOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int PRODUCT_ID_FIELD_NUMBER = 1;
        private volatile Object productId_;
        public static final int PRICE_TIER_FIELD_NUMBER = 2;
        private volatile Object priceTier_;
        public static final int OBTAIN_COUNT_FIELD_NUMBER = 3;
        private int obtainCount_;
        public static final int OBTAIN_LIMIT_FIELD_NUMBER = 4;
        private int obtainLimit_;
        public static final int BEGIN_TIME_FIELD_NUMBER = 5;
        private int beginTime_;
        public static final int END_TIME_FIELD_NUMBER = 6;
        private int endTime_;
        public static final int BUY_TIMES_FIELD_NUMBER = 7;
        private int buyTimes_;
        private byte memoizedIsInitialized;
        private static final ShopConcertProduct DEFAULT_INSTANCE;
        private static final Parser<ShopConcertProduct> PARSER;
        
        private ShopConcertProduct(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private ShopConcertProduct() {
            this.memoizedIsInitialized = -1;
            this.productId_ = "";
            this.priceTier_ = "";
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ShopConcertProduct();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ShopConcertProduct(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
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
                        case 10: {
                            final String s = input.readStringRequireUtf8();
                            this.productId_ = s;
                            continue;
                        }
                        case 18: {
                            final String s = input.readStringRequireUtf8();
                            this.priceTier_ = s;
                            continue;
                        }
                        case 24: {
                            this.obtainCount_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
                            this.obtainLimit_ = input.readUInt32();
                            continue;
                        }
                        case 40: {
                            this.beginTime_ = input.readUInt32();
                            continue;
                        }
                        case 48: {
                            this.endTime_ = input.readUInt32();
                            continue;
                        }
                        case 56: {
                            this.buyTimes_ = input.readUInt32();
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
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return ShopConcertProductOuterClass.internal_static_ShopConcertProduct_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ShopConcertProductOuterClass.internal_static_ShopConcertProduct_fieldAccessorTable.ensureFieldAccessorsInitialized(ShopConcertProduct.class, Builder.class);
        }
        
        @Override
        public String getProductId() {
            final Object ref = this.productId_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.productId_ = s);
        }
        
        @Override
        public ByteString getProductIdBytes() {
            final Object ref = this.productId_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.productId_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getPriceTier() {
            final Object ref = this.priceTier_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.priceTier_ = s);
        }
        
        @Override
        public ByteString getPriceTierBytes() {
            final Object ref = this.priceTier_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.priceTier_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public int getObtainCount() {
            return this.obtainCount_;
        }
        
        @Override
        public int getObtainLimit() {
            return this.obtainLimit_;
        }
        
        @Override
        public int getBeginTime() {
            return this.beginTime_;
        }
        
        @Override
        public int getEndTime() {
            return this.endTime_;
        }
        
        @Override
        public int getBuyTimes() {
            return this.buyTimes_;
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
            if (!GeneratedMessageV3.isStringEmpty(this.productId_)) {
                GeneratedMessageV3.writeString(output, 1, this.productId_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.priceTier_)) {
                GeneratedMessageV3.writeString(output, 2, this.priceTier_);
            }
            if (this.obtainCount_ != 0) {
                output.writeUInt32(3, this.obtainCount_);
            }
            if (this.obtainLimit_ != 0) {
                output.writeUInt32(4, this.obtainLimit_);
            }
            if (this.beginTime_ != 0) {
                output.writeUInt32(5, this.beginTime_);
            }
            if (this.endTime_ != 0) {
                output.writeUInt32(6, this.endTime_);
            }
            if (this.buyTimes_ != 0) {
                output.writeUInt32(7, this.buyTimes_);
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
            if (!GeneratedMessageV3.isStringEmpty(this.productId_)) {
                size += GeneratedMessageV3.computeStringSize(1, this.productId_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.priceTier_)) {
                size += GeneratedMessageV3.computeStringSize(2, this.priceTier_);
            }
            if (this.obtainCount_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.obtainCount_);
            }
            if (this.obtainLimit_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.obtainLimit_);
            }
            if (this.beginTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.beginTime_);
            }
            if (this.endTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.endTime_);
            }
            if (this.buyTimes_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.buyTimes_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShopConcertProduct)) {
                return super.equals(obj);
            }
            final ShopConcertProduct other = (ShopConcertProduct)obj;
            return this.getProductId().equals(other.getProductId()) && this.getPriceTier().equals(other.getPriceTier()) && this.getObtainCount() == other.getObtainCount() && this.getObtainLimit() == other.getObtainLimit() && this.getBeginTime() == other.getBeginTime() && this.getEndTime() == other.getEndTime() && this.getBuyTimes() == other.getBuyTimes() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getProductId().hashCode();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getPriceTier().hashCode();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getObtainCount();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getObtainLimit();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getBeginTime();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getEndTime();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getBuyTimes();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ShopConcertProduct parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ShopConcertProduct.PARSER.parseFrom(data);
        }
        
        public static ShopConcertProduct parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ShopConcertProduct.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ShopConcertProduct parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ShopConcertProduct.PARSER.parseFrom(data);
        }
        
        public static ShopConcertProduct parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ShopConcertProduct.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ShopConcertProduct parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ShopConcertProduct.PARSER.parseFrom(data);
        }
        
        public static ShopConcertProduct parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ShopConcertProduct.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ShopConcertProduct parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ShopConcertProduct.PARSER, input);
        }
        
        public static ShopConcertProduct parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ShopConcertProduct.PARSER, input, extensionRegistry);
        }
        
        public static ShopConcertProduct parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ShopConcertProduct.PARSER, input);
        }
        
        public static ShopConcertProduct parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ShopConcertProduct.PARSER, input, extensionRegistry);
        }
        
        public static ShopConcertProduct parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ShopConcertProduct.PARSER, input);
        }
        
        public static ShopConcertProduct parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ShopConcertProduct.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ShopConcertProduct.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ShopConcertProduct prototype) {
            return ShopConcertProduct.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ShopConcertProduct.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ShopConcertProduct getDefaultInstance() {
            return ShopConcertProduct.DEFAULT_INSTANCE;
        }
        
        public static Parser<ShopConcertProduct> parser() {
            return ShopConcertProduct.PARSER;
        }
        
        @Override
        public Parser<ShopConcertProduct> getParserForType() {
            return ShopConcertProduct.PARSER;
        }
        
        @Override
        public ShopConcertProduct getDefaultInstanceForType() {
            return ShopConcertProduct.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ShopConcertProduct();
            PARSER = new AbstractParser<ShopConcertProduct>() {
                @Override
                public ShopConcertProduct parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ShopConcertProduct(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ShopConcertProductOrBuilder
        {
            private Object productId_;
            private Object priceTier_;
            private int obtainCount_;
            private int obtainLimit_;
            private int beginTime_;
            private int endTime_;
            private int buyTimes_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ShopConcertProductOuterClass.internal_static_ShopConcertProduct_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ShopConcertProductOuterClass.internal_static_ShopConcertProduct_fieldAccessorTable.ensureFieldAccessorsInitialized(ShopConcertProduct.class, Builder.class);
            }
            
            private Builder() {
                this.productId_ = "";
                this.priceTier_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.productId_ = "";
                this.priceTier_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ShopConcertProduct.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.productId_ = "";
                this.priceTier_ = "";
                this.obtainCount_ = 0;
                this.obtainLimit_ = 0;
                this.beginTime_ = 0;
                this.endTime_ = 0;
                this.buyTimes_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ShopConcertProductOuterClass.internal_static_ShopConcertProduct_descriptor;
            }
            
            @Override
            public ShopConcertProduct getDefaultInstanceForType() {
                return ShopConcertProduct.getDefaultInstance();
            }
            
            @Override
            public ShopConcertProduct build() {
                final ShopConcertProduct result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ShopConcertProduct buildPartial() {
                final ShopConcertProduct result = new ShopConcertProduct(this);
                result.productId_ = this.productId_;
                result.priceTier_ = this.priceTier_;
                result.obtainCount_ = this.obtainCount_;
                result.obtainLimit_ = this.obtainLimit_;
                result.beginTime_ = this.beginTime_;
                result.endTime_ = this.endTime_;
                result.buyTimes_ = this.buyTimes_;
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
                if (other instanceof ShopConcertProduct) {
                    return this.mergeFrom((ShopConcertProduct)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ShopConcertProduct other) {
                if (other == ShopConcertProduct.getDefaultInstance()) {
                    return this;
                }
                if (!other.getProductId().isEmpty()) {
                    this.productId_ = other.productId_;
                    this.onChanged();
                }
                if (!other.getPriceTier().isEmpty()) {
                    this.priceTier_ = other.priceTier_;
                    this.onChanged();
                }
                if (other.getObtainCount() != 0) {
                    this.setObtainCount(other.getObtainCount());
                }
                if (other.getObtainLimit() != 0) {
                    this.setObtainLimit(other.getObtainLimit());
                }
                if (other.getBeginTime() != 0) {
                    this.setBeginTime(other.getBeginTime());
                }
                if (other.getEndTime() != 0) {
                    this.setEndTime(other.getEndTime());
                }
                if (other.getBuyTimes() != 0) {
                    this.setBuyTimes(other.getBuyTimes());
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
                ShopConcertProduct parsedMessage = null;
                try {
                    parsedMessage = ShopConcertProduct.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ShopConcertProduct)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            @Override
            public String getProductId() {
                final Object ref = this.productId_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.productId_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getProductIdBytes() {
                final Object ref = this.productId_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.productId_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setProductId(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.productId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearProductId() {
                this.productId_ = ShopConcertProduct.getDefaultInstance().getProductId();
                this.onChanged();
                return this;
            }
            
            public Builder setProductIdBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.productId_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getPriceTier() {
                final Object ref = this.priceTier_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.priceTier_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getPriceTierBytes() {
                final Object ref = this.priceTier_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.priceTier_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setPriceTier(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.priceTier_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPriceTier() {
                this.priceTier_ = ShopConcertProduct.getDefaultInstance().getPriceTier();
                this.onChanged();
                return this;
            }
            
            public Builder setPriceTierBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.priceTier_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getObtainCount() {
                return this.obtainCount_;
            }
            
            public Builder setObtainCount(final int value) {
                this.obtainCount_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearObtainCount() {
                this.obtainCount_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getObtainLimit() {
                return this.obtainLimit_;
            }
            
            public Builder setObtainLimit(final int value) {
                this.obtainLimit_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearObtainLimit() {
                this.obtainLimit_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getBeginTime() {
                return this.beginTime_;
            }
            
            public Builder setBeginTime(final int value) {
                this.beginTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearBeginTime() {
                this.beginTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getEndTime() {
                return this.endTime_;
            }
            
            public Builder setEndTime(final int value) {
                this.endTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearEndTime() {
                this.endTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getBuyTimes() {
                return this.buyTimes_;
            }
            
            public Builder setBuyTimes(final int value) {
                this.buyTimes_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearBuyTimes() {
                this.buyTimes_ = 0;
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
    
    public interface ShopConcertProductOrBuilder extends MessageOrBuilder
    {
        String getProductId();
        
        ByteString getProductIdBytes();
        
        String getPriceTier();
        
        ByteString getPriceTierBytes();
        
        int getObtainCount();
        
        int getObtainLimit();
        
        int getBeginTime();
        
        int getEndTime();
        
        int getBuyTimes();
    }
}
