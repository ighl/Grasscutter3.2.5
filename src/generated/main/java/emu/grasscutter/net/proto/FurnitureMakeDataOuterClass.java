// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
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

public final class FurnitureMakeDataOuterClass
{
    private static final Descriptors.Descriptor internal_static_FurnitureMakeData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_FurnitureMakeData_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private FurnitureMakeDataOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return FurnitureMakeDataOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0017FurnitureMakeData.proto\"\u0085\u0001\n\u0011FurnitureMakeData\u0012\r\n\u0005index\u0018\u000f \u0001(\r\u0012\u0010\n\bdur_time\u0018\u0001 \u0001(\r\u0012\u0012\n\nbegin_time\u0018\u000b \u0001(\u0007\u0012\u0017\n\u000faccelerate_time\u0018\u0006 \u0001(\u0007\u0012\u0011\n\tavatar_id\u0018\u0002 \u0001(\r\u0012\u000f\n\u0007make_id\u0018\u0005 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        FurnitureMakeDataOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_FurnitureMakeData_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_FurnitureMakeData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(FurnitureMakeDataOuterClass.internal_static_FurnitureMakeData_descriptor, new String[] { "Index", "DurTime", "BeginTime", "AccelerateTime", "AvatarId", "MakeId" });
    }
    
    public static final class FurnitureMakeData extends GeneratedMessageV3 implements FurnitureMakeDataOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int INDEX_FIELD_NUMBER = 15;
        private int index_;
        public static final int DUR_TIME_FIELD_NUMBER = 1;
        private int durTime_;
        public static final int BEGIN_TIME_FIELD_NUMBER = 11;
        private int beginTime_;
        public static final int ACCELERATE_TIME_FIELD_NUMBER = 6;
        private int accelerateTime_;
        public static final int AVATAR_ID_FIELD_NUMBER = 2;
        private int avatarId_;
        public static final int MAKE_ID_FIELD_NUMBER = 5;
        private int makeId_;
        private byte memoizedIsInitialized;
        private static final FurnitureMakeData DEFAULT_INSTANCE;
        private static final Parser<FurnitureMakeData> PARSER;
        
        private FurnitureMakeData(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private FurnitureMakeData() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new FurnitureMakeData();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private FurnitureMakeData(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 8: {
                            this.durTime_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.avatarId_ = input.readUInt32();
                            continue;
                        }
                        case 40: {
                            this.makeId_ = input.readUInt32();
                            continue;
                        }
                        case 53: {
                            this.accelerateTime_ = input.readFixed32();
                            continue;
                        }
                        case 93: {
                            this.beginTime_ = input.readFixed32();
                            continue;
                        }
                        case 120: {
                            this.index_ = input.readUInt32();
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
            return FurnitureMakeDataOuterClass.internal_static_FurnitureMakeData_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return FurnitureMakeDataOuterClass.internal_static_FurnitureMakeData_fieldAccessorTable.ensureFieldAccessorsInitialized(FurnitureMakeData.class, Builder.class);
        }
        
        @Override
        public int getIndex() {
            return this.index_;
        }
        
        @Override
        public int getDurTime() {
            return this.durTime_;
        }
        
        @Override
        public int getBeginTime() {
            return this.beginTime_;
        }
        
        @Override
        public int getAccelerateTime() {
            return this.accelerateTime_;
        }
        
        @Override
        public int getAvatarId() {
            return this.avatarId_;
        }
        
        @Override
        public int getMakeId() {
            return this.makeId_;
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
            if (this.durTime_ != 0) {
                output.writeUInt32(1, this.durTime_);
            }
            if (this.avatarId_ != 0) {
                output.writeUInt32(2, this.avatarId_);
            }
            if (this.makeId_ != 0) {
                output.writeUInt32(5, this.makeId_);
            }
            if (this.accelerateTime_ != 0) {
                output.writeFixed32(6, this.accelerateTime_);
            }
            if (this.beginTime_ != 0) {
                output.writeFixed32(11, this.beginTime_);
            }
            if (this.index_ != 0) {
                output.writeUInt32(15, this.index_);
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
            if (this.durTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.durTime_);
            }
            if (this.avatarId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.avatarId_);
            }
            if (this.makeId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.makeId_);
            }
            if (this.accelerateTime_ != 0) {
                size += CodedOutputStream.computeFixed32Size(6, this.accelerateTime_);
            }
            if (this.beginTime_ != 0) {
                size += CodedOutputStream.computeFixed32Size(11, this.beginTime_);
            }
            if (this.index_ != 0) {
                size += CodedOutputStream.computeUInt32Size(15, this.index_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FurnitureMakeData)) {
                return super.equals(obj);
            }
            final FurnitureMakeData other = (FurnitureMakeData)obj;
            return this.getIndex() == other.getIndex() && this.getDurTime() == other.getDurTime() && this.getBeginTime() == other.getBeginTime() && this.getAccelerateTime() == other.getAccelerateTime() && this.getAvatarId() == other.getAvatarId() && this.getMakeId() == other.getMakeId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getIndex();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getDurTime();
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getBeginTime();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getAccelerateTime();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getAvatarId();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getMakeId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static FurnitureMakeData parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return FurnitureMakeData.PARSER.parseFrom(data);
        }
        
        public static FurnitureMakeData parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FurnitureMakeData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FurnitureMakeData parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return FurnitureMakeData.PARSER.parseFrom(data);
        }
        
        public static FurnitureMakeData parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FurnitureMakeData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FurnitureMakeData parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return FurnitureMakeData.PARSER.parseFrom(data);
        }
        
        public static FurnitureMakeData parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FurnitureMakeData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FurnitureMakeData parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FurnitureMakeData.PARSER, input);
        }
        
        public static FurnitureMakeData parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FurnitureMakeData.PARSER, input, extensionRegistry);
        }
        
        public static FurnitureMakeData parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FurnitureMakeData.PARSER, input);
        }
        
        public static FurnitureMakeData parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FurnitureMakeData.PARSER, input, extensionRegistry);
        }
        
        public static FurnitureMakeData parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FurnitureMakeData.PARSER, input);
        }
        
        public static FurnitureMakeData parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FurnitureMakeData.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return FurnitureMakeData.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final FurnitureMakeData prototype) {
            return FurnitureMakeData.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == FurnitureMakeData.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static FurnitureMakeData getDefaultInstance() {
            return FurnitureMakeData.DEFAULT_INSTANCE;
        }
        
        public static Parser<FurnitureMakeData> parser() {
            return FurnitureMakeData.PARSER;
        }
        
        @Override
        public Parser<FurnitureMakeData> getParserForType() {
            return FurnitureMakeData.PARSER;
        }
        
        @Override
        public FurnitureMakeData getDefaultInstanceForType() {
            return FurnitureMakeData.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new FurnitureMakeData();
            PARSER = new AbstractParser<FurnitureMakeData>() {
                @Override
                public FurnitureMakeData parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new FurnitureMakeData(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FurnitureMakeDataOrBuilder
        {
            private int index_;
            private int durTime_;
            private int beginTime_;
            private int accelerateTime_;
            private int avatarId_;
            private int makeId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return FurnitureMakeDataOuterClass.internal_static_FurnitureMakeData_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return FurnitureMakeDataOuterClass.internal_static_FurnitureMakeData_fieldAccessorTable.ensureFieldAccessorsInitialized(FurnitureMakeData.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (FurnitureMakeData.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.index_ = 0;
                this.durTime_ = 0;
                this.beginTime_ = 0;
                this.accelerateTime_ = 0;
                this.avatarId_ = 0;
                this.makeId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return FurnitureMakeDataOuterClass.internal_static_FurnitureMakeData_descriptor;
            }
            
            @Override
            public FurnitureMakeData getDefaultInstanceForType() {
                return FurnitureMakeData.getDefaultInstance();
            }
            
            @Override
            public FurnitureMakeData build() {
                final FurnitureMakeData result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public FurnitureMakeData buildPartial() {
                final FurnitureMakeData result = new FurnitureMakeData(this);
                result.index_ = this.index_;
                result.durTime_ = this.durTime_;
                result.beginTime_ = this.beginTime_;
                result.accelerateTime_ = this.accelerateTime_;
                result.avatarId_ = this.avatarId_;
                result.makeId_ = this.makeId_;
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
                if (other instanceof FurnitureMakeData) {
                    return this.mergeFrom((FurnitureMakeData)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final FurnitureMakeData other) {
                if (other == FurnitureMakeData.getDefaultInstance()) {
                    return this;
                }
                if (other.getIndex() != 0) {
                    this.setIndex(other.getIndex());
                }
                if (other.getDurTime() != 0) {
                    this.setDurTime(other.getDurTime());
                }
                if (other.getBeginTime() != 0) {
                    this.setBeginTime(other.getBeginTime());
                }
                if (other.getAccelerateTime() != 0) {
                    this.setAccelerateTime(other.getAccelerateTime());
                }
                if (other.getAvatarId() != 0) {
                    this.setAvatarId(other.getAvatarId());
                }
                if (other.getMakeId() != 0) {
                    this.setMakeId(other.getMakeId());
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
                FurnitureMakeData parsedMessage = null;
                try {
                    parsedMessage = FurnitureMakeData.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (FurnitureMakeData)e.getUnfinishedMessage();
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
            public int getIndex() {
                return this.index_;
            }
            
            public Builder setIndex(final int value) {
                this.index_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIndex() {
                this.index_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getDurTime() {
                return this.durTime_;
            }
            
            public Builder setDurTime(final int value) {
                this.durTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearDurTime() {
                this.durTime_ = 0;
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
            public int getAccelerateTime() {
                return this.accelerateTime_;
            }
            
            public Builder setAccelerateTime(final int value) {
                this.accelerateTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAccelerateTime() {
                this.accelerateTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getAvatarId() {
                return this.avatarId_;
            }
            
            public Builder setAvatarId(final int value) {
                this.avatarId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAvatarId() {
                this.avatarId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getMakeId() {
                return this.makeId_;
            }
            
            public Builder setMakeId(final int value) {
                this.makeId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMakeId() {
                this.makeId_ = 0;
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
    
    public interface FurnitureMakeDataOrBuilder extends MessageOrBuilder
    {
        int getIndex();
        
        int getDurTime();
        
        int getBeginTime();
        
        int getAccelerateTime();
        
        int getAvatarId();
        
        int getMakeId();
    }
}
