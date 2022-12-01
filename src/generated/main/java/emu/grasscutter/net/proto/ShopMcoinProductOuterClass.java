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
import com.google.protobuf.Internal;
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

public final class ShopMcoinProductOuterClass
{
    private static final Descriptors.Descriptor internal_static_ShopMcoinProduct_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ShopMcoinProduct_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ShopMcoinProductOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ShopMcoinProductOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016ShopMcoinProduct.proto\"¢\u0001\n\u0010ShopMcoinProduct\u0012\u0012\n\nproduct_id\u0018\u0001 \u0001(\t\u0012\u0012\n\nprice_tier\u0018\u0002 \u0001(\t\u0012\u0012\n\nmcoin_base\u0018\u0003 \u0001(\r\u0012\u0017\n\u000fmcoin_non_first\u0018\u0004 \u0001(\r\u0012\u0013\n\u000bmcoin_first\u0018\u0005 \u0001(\r\u0012\u0012\n\nbought_num\u0018\u0006 \u0001(\r\u0012\u0010\n\bis_audit\u0018\u0007 \u0001(\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ShopMcoinProductOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_ShopMcoinProduct_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ShopMcoinProduct_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ShopMcoinProductOuterClass.internal_static_ShopMcoinProduct_descriptor, new String[] { "ProductId", "PriceTier", "McoinBase", "McoinNonFirst", "McoinFirst", "BoughtNum", "IsAudit" });
    }
    
    public static final class ShopMcoinProduct extends GeneratedMessageV3 implements ShopMcoinProductOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int PRODUCT_ID_FIELD_NUMBER = 1;
        private volatile Object productId_;
        public static final int PRICE_TIER_FIELD_NUMBER = 2;
        private volatile Object priceTier_;
        public static final int MCOIN_BASE_FIELD_NUMBER = 3;
        private int mcoinBase_;
        public static final int MCOIN_NON_FIRST_FIELD_NUMBER = 4;
        private int mcoinNonFirst_;
        public static final int MCOIN_FIRST_FIELD_NUMBER = 5;
        private int mcoinFirst_;
        public static final int BOUGHT_NUM_FIELD_NUMBER = 6;
        private int boughtNum_;
        public static final int IS_AUDIT_FIELD_NUMBER = 7;
        private boolean isAudit_;
        private byte memoizedIsInitialized;
        private static final ShopMcoinProduct DEFAULT_INSTANCE;
        private static final Parser<ShopMcoinProduct> PARSER;
        
        private ShopMcoinProduct(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private ShopMcoinProduct() {
            this.memoizedIsInitialized = -1;
            this.productId_ = "";
            this.priceTier_ = "";
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ShopMcoinProduct();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ShopMcoinProduct(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.mcoinBase_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
                            this.mcoinNonFirst_ = input.readUInt32();
                            continue;
                        }
                        case 40: {
                            this.mcoinFirst_ = input.readUInt32();
                            continue;
                        }
                        case 48: {
                            this.boughtNum_ = input.readUInt32();
                            continue;
                        }
                        case 56: {
                            this.isAudit_ = input.readBool();
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
            return ShopMcoinProductOuterClass.internal_static_ShopMcoinProduct_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ShopMcoinProductOuterClass.internal_static_ShopMcoinProduct_fieldAccessorTable.ensureFieldAccessorsInitialized(ShopMcoinProduct.class, Builder.class);
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
        public int getMcoinBase() {
            return this.mcoinBase_;
        }
        
        @Override
        public int getMcoinNonFirst() {
            return this.mcoinNonFirst_;
        }
        
        @Override
        public int getMcoinFirst() {
            return this.mcoinFirst_;
        }
        
        @Override
        public int getBoughtNum() {
            return this.boughtNum_;
        }
        
        @Override
        public boolean getIsAudit() {
            return this.isAudit_;
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
            if (this.mcoinBase_ != 0) {
                output.writeUInt32(3, this.mcoinBase_);
            }
            if (this.mcoinNonFirst_ != 0) {
                output.writeUInt32(4, this.mcoinNonFirst_);
            }
            if (this.mcoinFirst_ != 0) {
                output.writeUInt32(5, this.mcoinFirst_);
            }
            if (this.boughtNum_ != 0) {
                output.writeUInt32(6, this.boughtNum_);
            }
            if (this.isAudit_) {
                output.writeBool(7, this.isAudit_);
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
            if (this.mcoinBase_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.mcoinBase_);
            }
            if (this.mcoinNonFirst_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.mcoinNonFirst_);
            }
            if (this.mcoinFirst_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.mcoinFirst_);
            }
            if (this.boughtNum_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.boughtNum_);
            }
            if (this.isAudit_) {
                size += CodedOutputStream.computeBoolSize(7, this.isAudit_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShopMcoinProduct)) {
                return super.equals(obj);
            }
            final ShopMcoinProduct other = (ShopMcoinProduct)obj;
            return this.getProductId().equals(other.getProductId()) && this.getPriceTier().equals(other.getPriceTier()) && this.getMcoinBase() == other.getMcoinBase() && this.getMcoinNonFirst() == other.getMcoinNonFirst() && this.getMcoinFirst() == other.getMcoinFirst() && this.getBoughtNum() == other.getBoughtNum() && this.getIsAudit() == other.getIsAudit() && this.unknownFields.equals(other.unknownFields);
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
            hash = 53 * hash + this.getMcoinBase();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getMcoinNonFirst();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getMcoinFirst();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getBoughtNum();
            hash = 37 * hash + 7;
            hash = 53 * hash + Internal.hashBoolean(this.getIsAudit());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ShopMcoinProduct parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ShopMcoinProduct.PARSER.parseFrom(data);
        }
        
        public static ShopMcoinProduct parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ShopMcoinProduct.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ShopMcoinProduct parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ShopMcoinProduct.PARSER.parseFrom(data);
        }
        
        public static ShopMcoinProduct parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ShopMcoinProduct.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ShopMcoinProduct parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ShopMcoinProduct.PARSER.parseFrom(data);
        }
        
        public static ShopMcoinProduct parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ShopMcoinProduct.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ShopMcoinProduct parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ShopMcoinProduct.PARSER, input);
        }
        
        public static ShopMcoinProduct parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ShopMcoinProduct.PARSER, input, extensionRegistry);
        }
        
        public static ShopMcoinProduct parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ShopMcoinProduct.PARSER, input);
        }
        
        public static ShopMcoinProduct parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ShopMcoinProduct.PARSER, input, extensionRegistry);
        }
        
        public static ShopMcoinProduct parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ShopMcoinProduct.PARSER, input);
        }
        
        public static ShopMcoinProduct parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ShopMcoinProduct.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ShopMcoinProduct.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ShopMcoinProduct prototype) {
            return ShopMcoinProduct.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ShopMcoinProduct.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ShopMcoinProduct getDefaultInstance() {
            return ShopMcoinProduct.DEFAULT_INSTANCE;
        }
        
        public static Parser<ShopMcoinProduct> parser() {
            return ShopMcoinProduct.PARSER;
        }
        
        @Override
        public Parser<ShopMcoinProduct> getParserForType() {
            return ShopMcoinProduct.PARSER;
        }
        
        @Override
        public ShopMcoinProduct getDefaultInstanceForType() {
            return ShopMcoinProduct.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ShopMcoinProduct();
            PARSER = new AbstractParser<ShopMcoinProduct>() {
                @Override
                public ShopMcoinProduct parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ShopMcoinProduct(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ShopMcoinProductOrBuilder
        {
            private Object productId_;
            private Object priceTier_;
            private int mcoinBase_;
            private int mcoinNonFirst_;
            private int mcoinFirst_;
            private int boughtNum_;
            private boolean isAudit_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ShopMcoinProductOuterClass.internal_static_ShopMcoinProduct_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ShopMcoinProductOuterClass.internal_static_ShopMcoinProduct_fieldAccessorTable.ensureFieldAccessorsInitialized(ShopMcoinProduct.class, Builder.class);
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
                if (ShopMcoinProduct.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.productId_ = "";
                this.priceTier_ = "";
                this.mcoinBase_ = 0;
                this.mcoinNonFirst_ = 0;
                this.mcoinFirst_ = 0;
                this.boughtNum_ = 0;
                this.isAudit_ = false;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ShopMcoinProductOuterClass.internal_static_ShopMcoinProduct_descriptor;
            }
            
            @Override
            public ShopMcoinProduct getDefaultInstanceForType() {
                return ShopMcoinProduct.getDefaultInstance();
            }
            
            @Override
            public ShopMcoinProduct build() {
                final ShopMcoinProduct result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ShopMcoinProduct buildPartial() {
                final ShopMcoinProduct result = new ShopMcoinProduct(this);
                result.productId_ = this.productId_;
                result.priceTier_ = this.priceTier_;
                result.mcoinBase_ = this.mcoinBase_;
                result.mcoinNonFirst_ = this.mcoinNonFirst_;
                result.mcoinFirst_ = this.mcoinFirst_;
                result.boughtNum_ = this.boughtNum_;
                result.isAudit_ = this.isAudit_;
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
                if (other instanceof ShopMcoinProduct) {
                    return this.mergeFrom((ShopMcoinProduct)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ShopMcoinProduct other) {
                if (other == ShopMcoinProduct.getDefaultInstance()) {
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
                if (other.getMcoinBase() != 0) {
                    this.setMcoinBase(other.getMcoinBase());
                }
                if (other.getMcoinNonFirst() != 0) {
                    this.setMcoinNonFirst(other.getMcoinNonFirst());
                }
                if (other.getMcoinFirst() != 0) {
                    this.setMcoinFirst(other.getMcoinFirst());
                }
                if (other.getBoughtNum() != 0) {
                    this.setBoughtNum(other.getBoughtNum());
                }
                if (other.getIsAudit()) {
                    this.setIsAudit(other.getIsAudit());
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
                ShopMcoinProduct parsedMessage = null;
                try {
                    parsedMessage = ShopMcoinProduct.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ShopMcoinProduct)e.getUnfinishedMessage();
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
                this.productId_ = ShopMcoinProduct.getDefaultInstance().getProductId();
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
                this.priceTier_ = ShopMcoinProduct.getDefaultInstance().getPriceTier();
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
            public int getMcoinBase() {
                return this.mcoinBase_;
            }
            
            public Builder setMcoinBase(final int value) {
                this.mcoinBase_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMcoinBase() {
                this.mcoinBase_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getMcoinNonFirst() {
                return this.mcoinNonFirst_;
            }
            
            public Builder setMcoinNonFirst(final int value) {
                this.mcoinNonFirst_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMcoinNonFirst() {
                this.mcoinNonFirst_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getMcoinFirst() {
                return this.mcoinFirst_;
            }
            
            public Builder setMcoinFirst(final int value) {
                this.mcoinFirst_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMcoinFirst() {
                this.mcoinFirst_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getBoughtNum() {
                return this.boughtNum_;
            }
            
            public Builder setBoughtNum(final int value) {
                this.boughtNum_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearBoughtNum() {
                this.boughtNum_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsAudit() {
                return this.isAudit_;
            }
            
            public Builder setIsAudit(final boolean value) {
                this.isAudit_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsAudit() {
                this.isAudit_ = false;
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
    
    public interface ShopMcoinProductOrBuilder extends MessageOrBuilder
    {
        String getProductId();
        
        ByteString getProductIdBytes();
        
        String getPriceTier();
        
        ByteString getPriceTierBytes();
        
        int getMcoinBase();
        
        int getMcoinNonFirst();
        
        int getMcoinFirst();
        
        int getBoughtNum();
        
        boolean getIsAudit();
    }
}
