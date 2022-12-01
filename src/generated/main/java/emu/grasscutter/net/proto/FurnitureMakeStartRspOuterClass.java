// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
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

public final class FurnitureMakeStartRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_FurnitureMakeStartRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_FurnitureMakeStartRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private FurnitureMakeStartRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return FurnitureMakeStartRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bFurnitureMakeStartRsp.proto\u001a\u0017FurnitureMakeSlot.proto\"Y\n\u0015FurnitureMakeStartRsp\u0012/\n\u0013furniture_make_slot\u0018\u0005 \u0001(\u000b2\u0012.FurnitureMakeSlot\u0012\u000f\n\u0007retcode\u0018\b \u0001(\u0005B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        FurnitureMakeStartRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { FurnitureMakeSlotOuterClass.getDescriptor() });
        internal_static_FurnitureMakeStartRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_FurnitureMakeStartRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(FurnitureMakeStartRspOuterClass.internal_static_FurnitureMakeStartRsp_descriptor, new String[] { "FurnitureMakeSlot", "Retcode" });
        FurnitureMakeSlotOuterClass.getDescriptor();
    }
    
    public static final class FurnitureMakeStartRsp extends GeneratedMessageV3 implements FurnitureMakeStartRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int FURNITURE_MAKE_SLOT_FIELD_NUMBER = 5;
        private FurnitureMakeSlotOuterClass.FurnitureMakeSlot furnitureMakeSlot_;
        public static final int RETCODE_FIELD_NUMBER = 8;
        private int retcode_;
        private byte memoizedIsInitialized;
        private static final FurnitureMakeStartRsp DEFAULT_INSTANCE;
        private static final Parser<FurnitureMakeStartRsp> PARSER;
        
        private FurnitureMakeStartRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private FurnitureMakeStartRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new FurnitureMakeStartRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private FurnitureMakeStartRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 42: {
                            FurnitureMakeSlotOuterClass.FurnitureMakeSlot.Builder subBuilder = null;
                            if (this.furnitureMakeSlot_ != null) {
                                subBuilder = this.furnitureMakeSlot_.toBuilder();
                            }
                            this.furnitureMakeSlot_ = input.readMessage(FurnitureMakeSlotOuterClass.FurnitureMakeSlot.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.furnitureMakeSlot_);
                                this.furnitureMakeSlot_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 64: {
                            this.retcode_ = input.readInt32();
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
            return FurnitureMakeStartRspOuterClass.internal_static_FurnitureMakeStartRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return FurnitureMakeStartRspOuterClass.internal_static_FurnitureMakeStartRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(FurnitureMakeStartRsp.class, Builder.class);
        }
        
        @Override
        public boolean hasFurnitureMakeSlot() {
            return this.furnitureMakeSlot_ != null;
        }
        
        @Override
        public FurnitureMakeSlotOuterClass.FurnitureMakeSlot getFurnitureMakeSlot() {
            return (this.furnitureMakeSlot_ == null) ? FurnitureMakeSlotOuterClass.FurnitureMakeSlot.getDefaultInstance() : this.furnitureMakeSlot_;
        }
        
        @Override
        public FurnitureMakeSlotOuterClass.FurnitureMakeSlotOrBuilder getFurnitureMakeSlotOrBuilder() {
            return this.getFurnitureMakeSlot();
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
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
            if (this.furnitureMakeSlot_ != null) {
                output.writeMessage(5, this.getFurnitureMakeSlot());
            }
            if (this.retcode_ != 0) {
                output.writeInt32(8, this.retcode_);
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
            if (this.furnitureMakeSlot_ != null) {
                size += CodedOutputStream.computeMessageSize(5, this.getFurnitureMakeSlot());
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(8, this.retcode_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FurnitureMakeStartRsp)) {
                return super.equals(obj);
            }
            final FurnitureMakeStartRsp other = (FurnitureMakeStartRsp)obj;
            return this.hasFurnitureMakeSlot() == other.hasFurnitureMakeSlot() && (!this.hasFurnitureMakeSlot() || this.getFurnitureMakeSlot().equals(other.getFurnitureMakeSlot())) && this.getRetcode() == other.getRetcode() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasFurnitureMakeSlot()) {
                hash = 37 * hash + 5;
                hash = 53 * hash + this.getFurnitureMakeSlot().hashCode();
            }
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getRetcode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static FurnitureMakeStartRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return FurnitureMakeStartRsp.PARSER.parseFrom(data);
        }
        
        public static FurnitureMakeStartRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FurnitureMakeStartRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FurnitureMakeStartRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return FurnitureMakeStartRsp.PARSER.parseFrom(data);
        }
        
        public static FurnitureMakeStartRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FurnitureMakeStartRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FurnitureMakeStartRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return FurnitureMakeStartRsp.PARSER.parseFrom(data);
        }
        
        public static FurnitureMakeStartRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FurnitureMakeStartRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FurnitureMakeStartRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FurnitureMakeStartRsp.PARSER, input);
        }
        
        public static FurnitureMakeStartRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FurnitureMakeStartRsp.PARSER, input, extensionRegistry);
        }
        
        public static FurnitureMakeStartRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FurnitureMakeStartRsp.PARSER, input);
        }
        
        public static FurnitureMakeStartRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FurnitureMakeStartRsp.PARSER, input, extensionRegistry);
        }
        
        public static FurnitureMakeStartRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FurnitureMakeStartRsp.PARSER, input);
        }
        
        public static FurnitureMakeStartRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FurnitureMakeStartRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return FurnitureMakeStartRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final FurnitureMakeStartRsp prototype) {
            return FurnitureMakeStartRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == FurnitureMakeStartRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static FurnitureMakeStartRsp getDefaultInstance() {
            return FurnitureMakeStartRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<FurnitureMakeStartRsp> parser() {
            return FurnitureMakeStartRsp.PARSER;
        }
        
        @Override
        public Parser<FurnitureMakeStartRsp> getParserForType() {
            return FurnitureMakeStartRsp.PARSER;
        }
        
        @Override
        public FurnitureMakeStartRsp getDefaultInstanceForType() {
            return FurnitureMakeStartRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new FurnitureMakeStartRsp();
            PARSER = new AbstractParser<FurnitureMakeStartRsp>() {
                @Override
                public FurnitureMakeStartRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new FurnitureMakeStartRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FurnitureMakeStartRspOrBuilder
        {
            private FurnitureMakeSlotOuterClass.FurnitureMakeSlot furnitureMakeSlot_;
            private SingleFieldBuilderV3<FurnitureMakeSlotOuterClass.FurnitureMakeSlot, FurnitureMakeSlotOuterClass.FurnitureMakeSlot.Builder, FurnitureMakeSlotOuterClass.FurnitureMakeSlotOrBuilder> furnitureMakeSlotBuilder_;
            private int retcode_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return FurnitureMakeStartRspOuterClass.internal_static_FurnitureMakeStartRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return FurnitureMakeStartRspOuterClass.internal_static_FurnitureMakeStartRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(FurnitureMakeStartRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (FurnitureMakeStartRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.furnitureMakeSlotBuilder_ == null) {
                    this.furnitureMakeSlot_ = null;
                }
                else {
                    this.furnitureMakeSlot_ = null;
                    this.furnitureMakeSlotBuilder_ = null;
                }
                this.retcode_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return FurnitureMakeStartRspOuterClass.internal_static_FurnitureMakeStartRsp_descriptor;
            }
            
            @Override
            public FurnitureMakeStartRsp getDefaultInstanceForType() {
                return FurnitureMakeStartRsp.getDefaultInstance();
            }
            
            @Override
            public FurnitureMakeStartRsp build() {
                final FurnitureMakeStartRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public FurnitureMakeStartRsp buildPartial() {
                final FurnitureMakeStartRsp result = new FurnitureMakeStartRsp(this);
                if (this.furnitureMakeSlotBuilder_ == null) {
                    result.furnitureMakeSlot_ = this.furnitureMakeSlot_;
                }
                else {
                    result.furnitureMakeSlot_ = this.furnitureMakeSlotBuilder_.build();
                }
                result.retcode_ = this.retcode_;
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
                if (other instanceof FurnitureMakeStartRsp) {
                    return this.mergeFrom((FurnitureMakeStartRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final FurnitureMakeStartRsp other) {
                if (other == FurnitureMakeStartRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.hasFurnitureMakeSlot()) {
                    this.mergeFurnitureMakeSlot(other.getFurnitureMakeSlot());
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
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
                FurnitureMakeStartRsp parsedMessage = null;
                try {
                    parsedMessage = FurnitureMakeStartRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (FurnitureMakeStartRsp)e.getUnfinishedMessage();
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
            public boolean hasFurnitureMakeSlot() {
                return this.furnitureMakeSlotBuilder_ != null || this.furnitureMakeSlot_ != null;
            }
            
            @Override
            public FurnitureMakeSlotOuterClass.FurnitureMakeSlot getFurnitureMakeSlot() {
                if (this.furnitureMakeSlotBuilder_ == null) {
                    return (this.furnitureMakeSlot_ == null) ? FurnitureMakeSlotOuterClass.FurnitureMakeSlot.getDefaultInstance() : this.furnitureMakeSlot_;
                }
                return this.furnitureMakeSlotBuilder_.getMessage();
            }
            
            public Builder setFurnitureMakeSlot(final FurnitureMakeSlotOuterClass.FurnitureMakeSlot value) {
                if (this.furnitureMakeSlotBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.furnitureMakeSlot_ = value;
                    this.onChanged();
                }
                else {
                    this.furnitureMakeSlotBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setFurnitureMakeSlot(final FurnitureMakeSlotOuterClass.FurnitureMakeSlot.Builder builderForValue) {
                if (this.furnitureMakeSlotBuilder_ == null) {
                    this.furnitureMakeSlot_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.furnitureMakeSlotBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeFurnitureMakeSlot(final FurnitureMakeSlotOuterClass.FurnitureMakeSlot value) {
                if (this.furnitureMakeSlotBuilder_ == null) {
                    if (this.furnitureMakeSlot_ != null) {
                        this.furnitureMakeSlot_ = FurnitureMakeSlotOuterClass.FurnitureMakeSlot.newBuilder(this.furnitureMakeSlot_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.furnitureMakeSlot_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.furnitureMakeSlotBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearFurnitureMakeSlot() {
                if (this.furnitureMakeSlotBuilder_ == null) {
                    this.furnitureMakeSlot_ = null;
                    this.onChanged();
                }
                else {
                    this.furnitureMakeSlot_ = null;
                    this.furnitureMakeSlotBuilder_ = null;
                }
                return this;
            }
            
            public FurnitureMakeSlotOuterClass.FurnitureMakeSlot.Builder getFurnitureMakeSlotBuilder() {
                this.onChanged();
                return this.getFurnitureMakeSlotFieldBuilder().getBuilder();
            }
            
            @Override
            public FurnitureMakeSlotOuterClass.FurnitureMakeSlotOrBuilder getFurnitureMakeSlotOrBuilder() {
                if (this.furnitureMakeSlotBuilder_ != null) {
                    return this.furnitureMakeSlotBuilder_.getMessageOrBuilder();
                }
                return (this.furnitureMakeSlot_ == null) ? FurnitureMakeSlotOuterClass.FurnitureMakeSlot.getDefaultInstance() : this.furnitureMakeSlot_;
            }
            
            private SingleFieldBuilderV3<FurnitureMakeSlotOuterClass.FurnitureMakeSlot, FurnitureMakeSlotOuterClass.FurnitureMakeSlot.Builder, FurnitureMakeSlotOuterClass.FurnitureMakeSlotOrBuilder> getFurnitureMakeSlotFieldBuilder() {
                if (this.furnitureMakeSlotBuilder_ == null) {
                    this.furnitureMakeSlotBuilder_ = new SingleFieldBuilderV3<FurnitureMakeSlotOuterClass.FurnitureMakeSlot, FurnitureMakeSlotOuterClass.FurnitureMakeSlot.Builder, FurnitureMakeSlotOuterClass.FurnitureMakeSlotOrBuilder>(this.getFurnitureMakeSlot(), this.getParentForChildren(), this.isClean());
                    this.furnitureMakeSlot_ = null;
                }
                return this.furnitureMakeSlotBuilder_;
            }
            
            @Override
            public int getRetcode() {
                return this.retcode_;
            }
            
            public Builder setRetcode(final int value) {
                this.retcode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRetcode() {
                this.retcode_ = 0;
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
    
    public interface FurnitureMakeStartRspOrBuilder extends MessageOrBuilder
    {
        boolean hasFurnitureMakeSlot();
        
        FurnitureMakeSlotOuterClass.FurnitureMakeSlot getFurnitureMakeSlot();
        
        FurnitureMakeSlotOuterClass.FurnitureMakeSlotOrBuilder getFurnitureMakeSlotOrBuilder();
        
        int getRetcode();
    }
}
