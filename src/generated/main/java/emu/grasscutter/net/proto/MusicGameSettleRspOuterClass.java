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
import com.google.protobuf.Internal;
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

public final class MusicGameSettleRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_MusicGameSettleRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MusicGameSettleRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private MusicGameSettleRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MusicGameSettleRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0018MusicGameSettleRsp.proto\"\u008a\u0001\n\u0012MusicGameSettleRsp\u0012\u000f\n\u0007retcode\u0018\u000b \u0001(\u0005\u0012\u0016\n\u000emusic_basic_id\u0018\u0005 \u0001(\r\u0012\u0015\n\ris_new_record\u0018\u0006 \u0001(\b\u0012\u001c\n\u0014is_unlock_next_level\u0018\u0002 \u0001(\b\u0012\u0016\n\u000emusic_share_id\u0018\n \u0001(\u0004B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MusicGameSettleRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_MusicGameSettleRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MusicGameSettleRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MusicGameSettleRspOuterClass.internal_static_MusicGameSettleRsp_descriptor, new String[] { "Retcode", "MusicBasicId", "IsNewRecord", "IsUnlockNextLevel", "MusicShareId" });
    }
    
    public static final class MusicGameSettleRsp extends GeneratedMessageV3 implements MusicGameSettleRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RETCODE_FIELD_NUMBER = 11;
        private int retcode_;
        public static final int MUSIC_BASIC_ID_FIELD_NUMBER = 5;
        private int musicBasicId_;
        public static final int IS_NEW_RECORD_FIELD_NUMBER = 6;
        private boolean isNewRecord_;
        public static final int IS_UNLOCK_NEXT_LEVEL_FIELD_NUMBER = 2;
        private boolean isUnlockNextLevel_;
        public static final int MUSIC_SHARE_ID_FIELD_NUMBER = 10;
        private long musicShareId_;
        private byte memoizedIsInitialized;
        private static final MusicGameSettleRsp DEFAULT_INSTANCE;
        private static final Parser<MusicGameSettleRsp> PARSER;
        
        private MusicGameSettleRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private MusicGameSettleRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new MusicGameSettleRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private MusicGameSettleRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 16: {
                            this.isUnlockNextLevel_ = input.readBool();
                            continue;
                        }
                        case 40: {
                            this.musicBasicId_ = input.readUInt32();
                            continue;
                        }
                        case 48: {
                            this.isNewRecord_ = input.readBool();
                            continue;
                        }
                        case 80: {
                            this.musicShareId_ = input.readUInt64();
                            continue;
                        }
                        case 88: {
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
            return MusicGameSettleRspOuterClass.internal_static_MusicGameSettleRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MusicGameSettleRspOuterClass.internal_static_MusicGameSettleRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicGameSettleRsp.class, Builder.class);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public int getMusicBasicId() {
            return this.musicBasicId_;
        }
        
        @Override
        public boolean getIsNewRecord() {
            return this.isNewRecord_;
        }
        
        @Override
        public boolean getIsUnlockNextLevel() {
            return this.isUnlockNextLevel_;
        }
        
        @Override
        public long getMusicShareId() {
            return this.musicShareId_;
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
            if (this.isUnlockNextLevel_) {
                output.writeBool(2, this.isUnlockNextLevel_);
            }
            if (this.musicBasicId_ != 0) {
                output.writeUInt32(5, this.musicBasicId_);
            }
            if (this.isNewRecord_) {
                output.writeBool(6, this.isNewRecord_);
            }
            if (this.musicShareId_ != 0L) {
                output.writeUInt64(10, this.musicShareId_);
            }
            if (this.retcode_ != 0) {
                output.writeInt32(11, this.retcode_);
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
            if (this.isUnlockNextLevel_) {
                size += CodedOutputStream.computeBoolSize(2, this.isUnlockNextLevel_);
            }
            if (this.musicBasicId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.musicBasicId_);
            }
            if (this.isNewRecord_) {
                size += CodedOutputStream.computeBoolSize(6, this.isNewRecord_);
            }
            if (this.musicShareId_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(10, this.musicShareId_);
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(11, this.retcode_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MusicGameSettleRsp)) {
                return super.equals(obj);
            }
            final MusicGameSettleRsp other = (MusicGameSettleRsp)obj;
            return this.getRetcode() == other.getRetcode() && this.getMusicBasicId() == other.getMusicBasicId() && this.getIsNewRecord() == other.getIsNewRecord() && this.getIsUnlockNextLevel() == other.getIsUnlockNextLevel() && this.getMusicShareId() == other.getMusicShareId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getMusicBasicId();
            hash = 37 * hash + 6;
            hash = 53 * hash + Internal.hashBoolean(this.getIsNewRecord());
            hash = 37 * hash + 2;
            hash = 53 * hash + Internal.hashBoolean(this.getIsUnlockNextLevel());
            hash = 37 * hash + 10;
            hash = 53 * hash + Internal.hashLong(this.getMusicShareId());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static MusicGameSettleRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return MusicGameSettleRsp.PARSER.parseFrom(data);
        }
        
        public static MusicGameSettleRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameSettleRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameSettleRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return MusicGameSettleRsp.PARSER.parseFrom(data);
        }
        
        public static MusicGameSettleRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameSettleRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameSettleRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return MusicGameSettleRsp.PARSER.parseFrom(data);
        }
        
        public static MusicGameSettleRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameSettleRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameSettleRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameSettleRsp.PARSER, input);
        }
        
        public static MusicGameSettleRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameSettleRsp.PARSER, input, extensionRegistry);
        }
        
        public static MusicGameSettleRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MusicGameSettleRsp.PARSER, input);
        }
        
        public static MusicGameSettleRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MusicGameSettleRsp.PARSER, input, extensionRegistry);
        }
        
        public static MusicGameSettleRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameSettleRsp.PARSER, input);
        }
        
        public static MusicGameSettleRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameSettleRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return MusicGameSettleRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final MusicGameSettleRsp prototype) {
            return MusicGameSettleRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == MusicGameSettleRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static MusicGameSettleRsp getDefaultInstance() {
            return MusicGameSettleRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<MusicGameSettleRsp> parser() {
            return MusicGameSettleRsp.PARSER;
        }
        
        @Override
        public Parser<MusicGameSettleRsp> getParserForType() {
            return MusicGameSettleRsp.PARSER;
        }
        
        @Override
        public MusicGameSettleRsp getDefaultInstanceForType() {
            return MusicGameSettleRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new MusicGameSettleRsp();
            PARSER = new AbstractParser<MusicGameSettleRsp>() {
                @Override
                public MusicGameSettleRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new MusicGameSettleRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MusicGameSettleRspOrBuilder
        {
            private int retcode_;
            private int musicBasicId_;
            private boolean isNewRecord_;
            private boolean isUnlockNextLevel_;
            private long musicShareId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return MusicGameSettleRspOuterClass.internal_static_MusicGameSettleRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return MusicGameSettleRspOuterClass.internal_static_MusicGameSettleRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicGameSettleRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (MusicGameSettleRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                this.musicBasicId_ = 0;
                this.isNewRecord_ = false;
                this.isUnlockNextLevel_ = false;
                this.musicShareId_ = 0L;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return MusicGameSettleRspOuterClass.internal_static_MusicGameSettleRsp_descriptor;
            }
            
            @Override
            public MusicGameSettleRsp getDefaultInstanceForType() {
                return MusicGameSettleRsp.getDefaultInstance();
            }
            
            @Override
            public MusicGameSettleRsp build() {
                final MusicGameSettleRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public MusicGameSettleRsp buildPartial() {
                final MusicGameSettleRsp result = new MusicGameSettleRsp(this);
                result.retcode_ = this.retcode_;
                result.musicBasicId_ = this.musicBasicId_;
                result.isNewRecord_ = this.isNewRecord_;
                result.isUnlockNextLevel_ = this.isUnlockNextLevel_;
                result.musicShareId_ = this.musicShareId_;
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
                if (other instanceof MusicGameSettleRsp) {
                    return this.mergeFrom((MusicGameSettleRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final MusicGameSettleRsp other) {
                if (other == MusicGameSettleRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (other.getMusicBasicId() != 0) {
                    this.setMusicBasicId(other.getMusicBasicId());
                }
                if (other.getIsNewRecord()) {
                    this.setIsNewRecord(other.getIsNewRecord());
                }
                if (other.getIsUnlockNextLevel()) {
                    this.setIsUnlockNextLevel(other.getIsUnlockNextLevel());
                }
                if (other.getMusicShareId() != 0L) {
                    this.setMusicShareId(other.getMusicShareId());
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
                MusicGameSettleRsp parsedMessage = null;
                try {
                    parsedMessage = MusicGameSettleRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (MusicGameSettleRsp)e.getUnfinishedMessage();
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
            public int getMusicBasicId() {
                return this.musicBasicId_;
            }
            
            public Builder setMusicBasicId(final int value) {
                this.musicBasicId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMusicBasicId() {
                this.musicBasicId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsNewRecord() {
                return this.isNewRecord_;
            }
            
            public Builder setIsNewRecord(final boolean value) {
                this.isNewRecord_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsNewRecord() {
                this.isNewRecord_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsUnlockNextLevel() {
                return this.isUnlockNextLevel_;
            }
            
            public Builder setIsUnlockNextLevel(final boolean value) {
                this.isUnlockNextLevel_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsUnlockNextLevel() {
                this.isUnlockNextLevel_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public long getMusicShareId() {
                return this.musicShareId_;
            }
            
            public Builder setMusicShareId(final long value) {
                this.musicShareId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMusicShareId() {
                this.musicShareId_ = 0L;
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
    
    public interface MusicGameSettleRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
        
        int getMusicBasicId();
        
        boolean getIsNewRecord();
        
        boolean getIsUnlockNextLevel();
        
        long getMusicShareId();
    }
}
