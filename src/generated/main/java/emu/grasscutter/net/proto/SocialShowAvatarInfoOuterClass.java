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

public final class SocialShowAvatarInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_SocialShowAvatarInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SocialShowAvatarInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SocialShowAvatarInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SocialShowAvatarInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001aSocialShowAvatarInfo.proto\"L\n\u0014SocialShowAvatarInfo\u0012\u0011\n\tavatar_id\u0018\u0001 \u0001(\r\u0012\r\n\u0005level\u0018\u0002 \u0001(\r\u0012\u0012\n\ncostume_id\u0018\u0003 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SocialShowAvatarInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_SocialShowAvatarInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SocialShowAvatarInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SocialShowAvatarInfoOuterClass.internal_static_SocialShowAvatarInfo_descriptor, new String[] { "AvatarId", "Level", "CostumeId" });
    }
    
    public static final class SocialShowAvatarInfo extends GeneratedMessageV3 implements SocialShowAvatarInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int AVATAR_ID_FIELD_NUMBER = 1;
        private int avatarId_;
        public static final int LEVEL_FIELD_NUMBER = 2;
        private int level_;
        public static final int COSTUME_ID_FIELD_NUMBER = 3;
        private int costumeId_;
        private byte memoizedIsInitialized;
        private static final SocialShowAvatarInfo DEFAULT_INSTANCE;
        private static final Parser<SocialShowAvatarInfo> PARSER;
        
        private SocialShowAvatarInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private SocialShowAvatarInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SocialShowAvatarInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SocialShowAvatarInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.avatarId_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.level_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            this.costumeId_ = input.readUInt32();
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
            return SocialShowAvatarInfoOuterClass.internal_static_SocialShowAvatarInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SocialShowAvatarInfoOuterClass.internal_static_SocialShowAvatarInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SocialShowAvatarInfo.class, Builder.class);
        }
        
        @Override
        public int getAvatarId() {
            return this.avatarId_;
        }
        
        @Override
        public int getLevel() {
            return this.level_;
        }
        
        @Override
        public int getCostumeId() {
            return this.costumeId_;
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
            if (this.avatarId_ != 0) {
                output.writeUInt32(1, this.avatarId_);
            }
            if (this.level_ != 0) {
                output.writeUInt32(2, this.level_);
            }
            if (this.costumeId_ != 0) {
                output.writeUInt32(3, this.costumeId_);
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
            if (this.avatarId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.avatarId_);
            }
            if (this.level_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.level_);
            }
            if (this.costumeId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.costumeId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SocialShowAvatarInfo)) {
                return super.equals(obj);
            }
            final SocialShowAvatarInfo other = (SocialShowAvatarInfo)obj;
            return this.getAvatarId() == other.getAvatarId() && this.getLevel() == other.getLevel() && this.getCostumeId() == other.getCostumeId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getAvatarId();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getLevel();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getCostumeId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SocialShowAvatarInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SocialShowAvatarInfo.PARSER.parseFrom(data);
        }
        
        public static SocialShowAvatarInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SocialShowAvatarInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SocialShowAvatarInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SocialShowAvatarInfo.PARSER.parseFrom(data);
        }
        
        public static SocialShowAvatarInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SocialShowAvatarInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SocialShowAvatarInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SocialShowAvatarInfo.PARSER.parseFrom(data);
        }
        
        public static SocialShowAvatarInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SocialShowAvatarInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SocialShowAvatarInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SocialShowAvatarInfo.PARSER, input);
        }
        
        public static SocialShowAvatarInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SocialShowAvatarInfo.PARSER, input, extensionRegistry);
        }
        
        public static SocialShowAvatarInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SocialShowAvatarInfo.PARSER, input);
        }
        
        public static SocialShowAvatarInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SocialShowAvatarInfo.PARSER, input, extensionRegistry);
        }
        
        public static SocialShowAvatarInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SocialShowAvatarInfo.PARSER, input);
        }
        
        public static SocialShowAvatarInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SocialShowAvatarInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SocialShowAvatarInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SocialShowAvatarInfo prototype) {
            return SocialShowAvatarInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SocialShowAvatarInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SocialShowAvatarInfo getDefaultInstance() {
            return SocialShowAvatarInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<SocialShowAvatarInfo> parser() {
            return SocialShowAvatarInfo.PARSER;
        }
        
        @Override
        public Parser<SocialShowAvatarInfo> getParserForType() {
            return SocialShowAvatarInfo.PARSER;
        }
        
        @Override
        public SocialShowAvatarInfo getDefaultInstanceForType() {
            return SocialShowAvatarInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SocialShowAvatarInfo();
            PARSER = new AbstractParser<SocialShowAvatarInfo>() {
                @Override
                public SocialShowAvatarInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SocialShowAvatarInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SocialShowAvatarInfoOrBuilder
        {
            private int avatarId_;
            private int level_;
            private int costumeId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SocialShowAvatarInfoOuterClass.internal_static_SocialShowAvatarInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SocialShowAvatarInfoOuterClass.internal_static_SocialShowAvatarInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SocialShowAvatarInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SocialShowAvatarInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.avatarId_ = 0;
                this.level_ = 0;
                this.costumeId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SocialShowAvatarInfoOuterClass.internal_static_SocialShowAvatarInfo_descriptor;
            }
            
            @Override
            public SocialShowAvatarInfo getDefaultInstanceForType() {
                return SocialShowAvatarInfo.getDefaultInstance();
            }
            
            @Override
            public SocialShowAvatarInfo build() {
                final SocialShowAvatarInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SocialShowAvatarInfo buildPartial() {
                final SocialShowAvatarInfo result = new SocialShowAvatarInfo(this);
                result.avatarId_ = this.avatarId_;
                result.level_ = this.level_;
                result.costumeId_ = this.costumeId_;
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
                if (other instanceof SocialShowAvatarInfo) {
                    return this.mergeFrom((SocialShowAvatarInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SocialShowAvatarInfo other) {
                if (other == SocialShowAvatarInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getAvatarId() != 0) {
                    this.setAvatarId(other.getAvatarId());
                }
                if (other.getLevel() != 0) {
                    this.setLevel(other.getLevel());
                }
                if (other.getCostumeId() != 0) {
                    this.setCostumeId(other.getCostumeId());
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
                SocialShowAvatarInfo parsedMessage = null;
                try {
                    parsedMessage = SocialShowAvatarInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SocialShowAvatarInfo)e.getUnfinishedMessage();
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
            public int getLevel() {
                return this.level_;
            }
            
            public Builder setLevel(final int value) {
                this.level_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearLevel() {
                this.level_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCostumeId() {
                return this.costumeId_;
            }
            
            public Builder setCostumeId(final int value) {
                this.costumeId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCostumeId() {
                this.costumeId_ = 0;
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
    
    public interface SocialShowAvatarInfoOrBuilder extends MessageOrBuilder
    {
        int getAvatarId();
        
        int getLevel();
        
        int getCostumeId();
    }
}
