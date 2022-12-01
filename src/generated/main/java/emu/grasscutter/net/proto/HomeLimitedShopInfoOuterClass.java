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

public final class HomeLimitedShopInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_HomeLimitedShopInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_HomeLimitedShopInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private HomeLimitedShopInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return HomeLimitedShopInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019HomeLimitedShopInfo.proto\u001a\fVector.proto\"©\u0001\n\u0013HomeLimitedShopInfo\u0012\u0017\n\u000fnext_close_time\u0018\t \u0001(\u0007\u0012\u001c\n\u0014next_guest_open_time\u0018\u000b \u0001(\u0007\u0012\u001a\n\tdjinn_rot\u0018\u0007 \u0001(\u000b2\u0007.Vector\u0012\u000b\n\u0003uid\u0018\u0004 \u0001(\r\u0012\u0016\n\u000enext_open_time\u0018\u0006 \u0001(\u0007\u0012\u001a\n\tdjinn_pos\u0018\u0002 \u0001(\u000b2\u0007.VectorB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        HomeLimitedShopInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { VectorOuterClass.getDescriptor() });
        internal_static_HomeLimitedShopInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_HomeLimitedShopInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(HomeLimitedShopInfoOuterClass.internal_static_HomeLimitedShopInfo_descriptor, new String[] { "NextCloseTime", "NextGuestOpenTime", "DjinnRot", "Uid", "NextOpenTime", "DjinnPos" });
        VectorOuterClass.getDescriptor();
    }
    
    public static final class HomeLimitedShopInfo extends GeneratedMessageV3 implements HomeLimitedShopInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int NEXT_CLOSE_TIME_FIELD_NUMBER = 9;
        private int nextCloseTime_;
        public static final int NEXT_GUEST_OPEN_TIME_FIELD_NUMBER = 11;
        private int nextGuestOpenTime_;
        public static final int DJINN_ROT_FIELD_NUMBER = 7;
        private VectorOuterClass.Vector djinnRot_;
        public static final int UID_FIELD_NUMBER = 4;
        private int uid_;
        public static final int NEXT_OPEN_TIME_FIELD_NUMBER = 6;
        private int nextOpenTime_;
        public static final int DJINN_POS_FIELD_NUMBER = 2;
        private VectorOuterClass.Vector djinnPos_;
        private byte memoizedIsInitialized;
        private static final HomeLimitedShopInfo DEFAULT_INSTANCE;
        private static final Parser<HomeLimitedShopInfo> PARSER;
        
        private HomeLimitedShopInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private HomeLimitedShopInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new HomeLimitedShopInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private HomeLimitedShopInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 18: {
                            VectorOuterClass.Vector.Builder subBuilder = null;
                            if (this.djinnPos_ != null) {
                                subBuilder = this.djinnPos_.toBuilder();
                            }
                            this.djinnPos_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.djinnPos_);
                                this.djinnPos_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 32: {
                            this.uid_ = input.readUInt32();
                            continue;
                        }
                        case 53: {
                            this.nextOpenTime_ = input.readFixed32();
                            continue;
                        }
                        case 58: {
                            VectorOuterClass.Vector.Builder subBuilder = null;
                            if (this.djinnRot_ != null) {
                                subBuilder = this.djinnRot_.toBuilder();
                            }
                            this.djinnRot_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.djinnRot_);
                                this.djinnRot_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 77: {
                            this.nextCloseTime_ = input.readFixed32();
                            continue;
                        }
                        case 93: {
                            this.nextGuestOpenTime_ = input.readFixed32();
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
            return HomeLimitedShopInfoOuterClass.internal_static_HomeLimitedShopInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return HomeLimitedShopInfoOuterClass.internal_static_HomeLimitedShopInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeLimitedShopInfo.class, Builder.class);
        }
        
        @Override
        public int getNextCloseTime() {
            return this.nextCloseTime_;
        }
        
        @Override
        public int getNextGuestOpenTime() {
            return this.nextGuestOpenTime_;
        }
        
        @Override
        public boolean hasDjinnRot() {
            return this.djinnRot_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getDjinnRot() {
            return (this.djinnRot_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.djinnRot_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getDjinnRotOrBuilder() {
            return this.getDjinnRot();
        }
        
        @Override
        public int getUid() {
            return this.uid_;
        }
        
        @Override
        public int getNextOpenTime() {
            return this.nextOpenTime_;
        }
        
        @Override
        public boolean hasDjinnPos() {
            return this.djinnPos_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getDjinnPos() {
            return (this.djinnPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.djinnPos_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getDjinnPosOrBuilder() {
            return this.getDjinnPos();
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
            if (this.djinnPos_ != null) {
                output.writeMessage(2, this.getDjinnPos());
            }
            if (this.uid_ != 0) {
                output.writeUInt32(4, this.uid_);
            }
            if (this.nextOpenTime_ != 0) {
                output.writeFixed32(6, this.nextOpenTime_);
            }
            if (this.djinnRot_ != null) {
                output.writeMessage(7, this.getDjinnRot());
            }
            if (this.nextCloseTime_ != 0) {
                output.writeFixed32(9, this.nextCloseTime_);
            }
            if (this.nextGuestOpenTime_ != 0) {
                output.writeFixed32(11, this.nextGuestOpenTime_);
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
            if (this.djinnPos_ != null) {
                size += CodedOutputStream.computeMessageSize(2, this.getDjinnPos());
            }
            if (this.uid_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.uid_);
            }
            if (this.nextOpenTime_ != 0) {
                size += CodedOutputStream.computeFixed32Size(6, this.nextOpenTime_);
            }
            if (this.djinnRot_ != null) {
                size += CodedOutputStream.computeMessageSize(7, this.getDjinnRot());
            }
            if (this.nextCloseTime_ != 0) {
                size += CodedOutputStream.computeFixed32Size(9, this.nextCloseTime_);
            }
            if (this.nextGuestOpenTime_ != 0) {
                size += CodedOutputStream.computeFixed32Size(11, this.nextGuestOpenTime_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HomeLimitedShopInfo)) {
                return super.equals(obj);
            }
            final HomeLimitedShopInfo other = (HomeLimitedShopInfo)obj;
            return this.getNextCloseTime() == other.getNextCloseTime() && this.getNextGuestOpenTime() == other.getNextGuestOpenTime() && this.hasDjinnRot() == other.hasDjinnRot() && (!this.hasDjinnRot() || this.getDjinnRot().equals(other.getDjinnRot())) && this.getUid() == other.getUid() && this.getNextOpenTime() == other.getNextOpenTime() && this.hasDjinnPos() == other.hasDjinnPos() && (!this.hasDjinnPos() || this.getDjinnPos().equals(other.getDjinnPos())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getNextCloseTime();
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getNextGuestOpenTime();
            if (this.hasDjinnRot()) {
                hash = 37 * hash + 7;
                hash = 53 * hash + this.getDjinnRot().hashCode();
            }
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getUid();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getNextOpenTime();
            if (this.hasDjinnPos()) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getDjinnPos().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static HomeLimitedShopInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return HomeLimitedShopInfo.PARSER.parseFrom(data);
        }
        
        public static HomeLimitedShopInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeLimitedShopInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeLimitedShopInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return HomeLimitedShopInfo.PARSER.parseFrom(data);
        }
        
        public static HomeLimitedShopInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeLimitedShopInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeLimitedShopInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return HomeLimitedShopInfo.PARSER.parseFrom(data);
        }
        
        public static HomeLimitedShopInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeLimitedShopInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeLimitedShopInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeLimitedShopInfo.PARSER, input);
        }
        
        public static HomeLimitedShopInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeLimitedShopInfo.PARSER, input, extensionRegistry);
        }
        
        public static HomeLimitedShopInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeLimitedShopInfo.PARSER, input);
        }
        
        public static HomeLimitedShopInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeLimitedShopInfo.PARSER, input, extensionRegistry);
        }
        
        public static HomeLimitedShopInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeLimitedShopInfo.PARSER, input);
        }
        
        public static HomeLimitedShopInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeLimitedShopInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return HomeLimitedShopInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final HomeLimitedShopInfo prototype) {
            return HomeLimitedShopInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == HomeLimitedShopInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static HomeLimitedShopInfo getDefaultInstance() {
            return HomeLimitedShopInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<HomeLimitedShopInfo> parser() {
            return HomeLimitedShopInfo.PARSER;
        }
        
        @Override
        public Parser<HomeLimitedShopInfo> getParserForType() {
            return HomeLimitedShopInfo.PARSER;
        }
        
        @Override
        public HomeLimitedShopInfo getDefaultInstanceForType() {
            return HomeLimitedShopInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new HomeLimitedShopInfo();
            PARSER = new AbstractParser<HomeLimitedShopInfo>() {
                @Override
                public HomeLimitedShopInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new HomeLimitedShopInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HomeLimitedShopInfoOrBuilder
        {
            private int nextCloseTime_;
            private int nextGuestOpenTime_;
            private VectorOuterClass.Vector djinnRot_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> djinnRotBuilder_;
            private int uid_;
            private int nextOpenTime_;
            private VectorOuterClass.Vector djinnPos_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> djinnPosBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return HomeLimitedShopInfoOuterClass.internal_static_HomeLimitedShopInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return HomeLimitedShopInfoOuterClass.internal_static_HomeLimitedShopInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeLimitedShopInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (HomeLimitedShopInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.nextCloseTime_ = 0;
                this.nextGuestOpenTime_ = 0;
                if (this.djinnRotBuilder_ == null) {
                    this.djinnRot_ = null;
                }
                else {
                    this.djinnRot_ = null;
                    this.djinnRotBuilder_ = null;
                }
                this.uid_ = 0;
                this.nextOpenTime_ = 0;
                if (this.djinnPosBuilder_ == null) {
                    this.djinnPos_ = null;
                }
                else {
                    this.djinnPos_ = null;
                    this.djinnPosBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return HomeLimitedShopInfoOuterClass.internal_static_HomeLimitedShopInfo_descriptor;
            }
            
            @Override
            public HomeLimitedShopInfo getDefaultInstanceForType() {
                return HomeLimitedShopInfo.getDefaultInstance();
            }
            
            @Override
            public HomeLimitedShopInfo build() {
                final HomeLimitedShopInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public HomeLimitedShopInfo buildPartial() {
                final HomeLimitedShopInfo result = new HomeLimitedShopInfo(this);
                result.nextCloseTime_ = this.nextCloseTime_;
                result.nextGuestOpenTime_ = this.nextGuestOpenTime_;
                if (this.djinnRotBuilder_ == null) {
                    result.djinnRot_ = this.djinnRot_;
                }
                else {
                    result.djinnRot_ = this.djinnRotBuilder_.build();
                }
                result.uid_ = this.uid_;
                result.nextOpenTime_ = this.nextOpenTime_;
                if (this.djinnPosBuilder_ == null) {
                    result.djinnPos_ = this.djinnPos_;
                }
                else {
                    result.djinnPos_ = this.djinnPosBuilder_.build();
                }
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
                if (other instanceof HomeLimitedShopInfo) {
                    return this.mergeFrom((HomeLimitedShopInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final HomeLimitedShopInfo other) {
                if (other == HomeLimitedShopInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getNextCloseTime() != 0) {
                    this.setNextCloseTime(other.getNextCloseTime());
                }
                if (other.getNextGuestOpenTime() != 0) {
                    this.setNextGuestOpenTime(other.getNextGuestOpenTime());
                }
                if (other.hasDjinnRot()) {
                    this.mergeDjinnRot(other.getDjinnRot());
                }
                if (other.getUid() != 0) {
                    this.setUid(other.getUid());
                }
                if (other.getNextOpenTime() != 0) {
                    this.setNextOpenTime(other.getNextOpenTime());
                }
                if (other.hasDjinnPos()) {
                    this.mergeDjinnPos(other.getDjinnPos());
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
                HomeLimitedShopInfo parsedMessage = null;
                try {
                    parsedMessage = HomeLimitedShopInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (HomeLimitedShopInfo)e.getUnfinishedMessage();
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
            public int getNextCloseTime() {
                return this.nextCloseTime_;
            }
            
            public Builder setNextCloseTime(final int value) {
                this.nextCloseTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearNextCloseTime() {
                this.nextCloseTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getNextGuestOpenTime() {
                return this.nextGuestOpenTime_;
            }
            
            public Builder setNextGuestOpenTime(final int value) {
                this.nextGuestOpenTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearNextGuestOpenTime() {
                this.nextGuestOpenTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasDjinnRot() {
                return this.djinnRotBuilder_ != null || this.djinnRot_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getDjinnRot() {
                if (this.djinnRotBuilder_ == null) {
                    return (this.djinnRot_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.djinnRot_;
                }
                return this.djinnRotBuilder_.getMessage();
            }
            
            public Builder setDjinnRot(final VectorOuterClass.Vector value) {
                if (this.djinnRotBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.djinnRot_ = value;
                    this.onChanged();
                }
                else {
                    this.djinnRotBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setDjinnRot(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.djinnRotBuilder_ == null) {
                    this.djinnRot_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.djinnRotBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeDjinnRot(final VectorOuterClass.Vector value) {
                if (this.djinnRotBuilder_ == null) {
                    if (this.djinnRot_ != null) {
                        this.djinnRot_ = VectorOuterClass.Vector.newBuilder(this.djinnRot_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.djinnRot_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.djinnRotBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearDjinnRot() {
                if (this.djinnRotBuilder_ == null) {
                    this.djinnRot_ = null;
                    this.onChanged();
                }
                else {
                    this.djinnRot_ = null;
                    this.djinnRotBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getDjinnRotBuilder() {
                this.onChanged();
                return this.getDjinnRotFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getDjinnRotOrBuilder() {
                if (this.djinnRotBuilder_ != null) {
                    return this.djinnRotBuilder_.getMessageOrBuilder();
                }
                return (this.djinnRot_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.djinnRot_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getDjinnRotFieldBuilder() {
                if (this.djinnRotBuilder_ == null) {
                    this.djinnRotBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getDjinnRot(), this.getParentForChildren(), this.isClean());
                    this.djinnRot_ = null;
                }
                return this.djinnRotBuilder_;
            }
            
            @Override
            public int getUid() {
                return this.uid_;
            }
            
            public Builder setUid(final int value) {
                this.uid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUid() {
                this.uid_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getNextOpenTime() {
                return this.nextOpenTime_;
            }
            
            public Builder setNextOpenTime(final int value) {
                this.nextOpenTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearNextOpenTime() {
                this.nextOpenTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasDjinnPos() {
                return this.djinnPosBuilder_ != null || this.djinnPos_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getDjinnPos() {
                if (this.djinnPosBuilder_ == null) {
                    return (this.djinnPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.djinnPos_;
                }
                return this.djinnPosBuilder_.getMessage();
            }
            
            public Builder setDjinnPos(final VectorOuterClass.Vector value) {
                if (this.djinnPosBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.djinnPos_ = value;
                    this.onChanged();
                }
                else {
                    this.djinnPosBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setDjinnPos(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.djinnPosBuilder_ == null) {
                    this.djinnPos_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.djinnPosBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeDjinnPos(final VectorOuterClass.Vector value) {
                if (this.djinnPosBuilder_ == null) {
                    if (this.djinnPos_ != null) {
                        this.djinnPos_ = VectorOuterClass.Vector.newBuilder(this.djinnPos_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.djinnPos_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.djinnPosBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearDjinnPos() {
                if (this.djinnPosBuilder_ == null) {
                    this.djinnPos_ = null;
                    this.onChanged();
                }
                else {
                    this.djinnPos_ = null;
                    this.djinnPosBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getDjinnPosBuilder() {
                this.onChanged();
                return this.getDjinnPosFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getDjinnPosOrBuilder() {
                if (this.djinnPosBuilder_ != null) {
                    return this.djinnPosBuilder_.getMessageOrBuilder();
                }
                return (this.djinnPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.djinnPos_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getDjinnPosFieldBuilder() {
                if (this.djinnPosBuilder_ == null) {
                    this.djinnPosBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getDjinnPos(), this.getParentForChildren(), this.isClean());
                    this.djinnPos_ = null;
                }
                return this.djinnPosBuilder_;
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
    
    public interface HomeLimitedShopInfoOrBuilder extends MessageOrBuilder
    {
        int getNextCloseTime();
        
        int getNextGuestOpenTime();
        
        boolean hasDjinnRot();
        
        VectorOuterClass.Vector getDjinnRot();
        
        VectorOuterClass.VectorOrBuilder getDjinnRotOrBuilder();
        
        int getUid();
        
        int getNextOpenTime();
        
        boolean hasDjinnPos();
        
        VectorOuterClass.Vector getDjinnPos();
        
        VectorOuterClass.VectorOrBuilder getDjinnPosOrBuilder();
    }
}
