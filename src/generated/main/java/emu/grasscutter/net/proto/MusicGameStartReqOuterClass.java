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

public final class MusicGameStartReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_MusicGameStartReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MusicGameStartReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private MusicGameStartReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MusicGameStartReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0017MusicGameStartReq.proto\"`\n\u0011MusicGameStartReq\u0012\u0016\n\u000emusic_basic_id\u0018\u0002 \u0001(\r\u0012\u001b\n\u0013Unk2700_IOKPIKJDEHG\u0018\u000b \u0001(\b\u0012\u0016\n\u000emusic_share_id\u0018\u0003 \u0001(\u0004B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MusicGameStartReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_MusicGameStartReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MusicGameStartReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MusicGameStartReqOuterClass.internal_static_MusicGameStartReq_descriptor, new String[] { "MusicBasicId", "Unk2700IOKPIKJDEHG", "MusicShareId" });
    }
    
    public static final class MusicGameStartReq extends GeneratedMessageV3 implements MusicGameStartReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int MUSIC_BASIC_ID_FIELD_NUMBER = 2;
        private int musicBasicId_;
        public static final int UNK2700_IOKPIKJDEHG_FIELD_NUMBER = 11;
        private boolean unk2700IOKPIKJDEHG_;
        public static final int MUSIC_SHARE_ID_FIELD_NUMBER = 3;
        private long musicShareId_;
        private byte memoizedIsInitialized;
        private static final MusicGameStartReq DEFAULT_INSTANCE;
        private static final Parser<MusicGameStartReq> PARSER;
        
        private MusicGameStartReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private MusicGameStartReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new MusicGameStartReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private MusicGameStartReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.musicBasicId_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            this.musicShareId_ = input.readUInt64();
                            continue;
                        }
                        case 88: {
                            this.unk2700IOKPIKJDEHG_ = input.readBool();
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
            return MusicGameStartReqOuterClass.internal_static_MusicGameStartReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MusicGameStartReqOuterClass.internal_static_MusicGameStartReq_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicGameStartReq.class, Builder.class);
        }
        
        @Override
        public int getMusicBasicId() {
            return this.musicBasicId_;
        }
        
        @Override
        public boolean getUnk2700IOKPIKJDEHG() {
            return this.unk2700IOKPIKJDEHG_;
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
            if (this.musicBasicId_ != 0) {
                output.writeUInt32(2, this.musicBasicId_);
            }
            if (this.musicShareId_ != 0L) {
                output.writeUInt64(3, this.musicShareId_);
            }
            if (this.unk2700IOKPIKJDEHG_) {
                output.writeBool(11, this.unk2700IOKPIKJDEHG_);
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
            if (this.musicBasicId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.musicBasicId_);
            }
            if (this.musicShareId_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(3, this.musicShareId_);
            }
            if (this.unk2700IOKPIKJDEHG_) {
                size += CodedOutputStream.computeBoolSize(11, this.unk2700IOKPIKJDEHG_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MusicGameStartReq)) {
                return super.equals(obj);
            }
            final MusicGameStartReq other = (MusicGameStartReq)obj;
            return this.getMusicBasicId() == other.getMusicBasicId() && this.getUnk2700IOKPIKJDEHG() == other.getUnk2700IOKPIKJDEHG() && this.getMusicShareId() == other.getMusicShareId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getMusicBasicId();
            hash = 37 * hash + 11;
            hash = 53 * hash + Internal.hashBoolean(this.getUnk2700IOKPIKJDEHG());
            hash = 37 * hash + 3;
            hash = 53 * hash + Internal.hashLong(this.getMusicShareId());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static MusicGameStartReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return MusicGameStartReq.PARSER.parseFrom(data);
        }
        
        public static MusicGameStartReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameStartReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameStartReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return MusicGameStartReq.PARSER.parseFrom(data);
        }
        
        public static MusicGameStartReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameStartReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameStartReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return MusicGameStartReq.PARSER.parseFrom(data);
        }
        
        public static MusicGameStartReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameStartReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameStartReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameStartReq.PARSER, input);
        }
        
        public static MusicGameStartReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameStartReq.PARSER, input, extensionRegistry);
        }
        
        public static MusicGameStartReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MusicGameStartReq.PARSER, input);
        }
        
        public static MusicGameStartReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MusicGameStartReq.PARSER, input, extensionRegistry);
        }
        
        public static MusicGameStartReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameStartReq.PARSER, input);
        }
        
        public static MusicGameStartReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameStartReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return MusicGameStartReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final MusicGameStartReq prototype) {
            return MusicGameStartReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == MusicGameStartReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static MusicGameStartReq getDefaultInstance() {
            return MusicGameStartReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<MusicGameStartReq> parser() {
            return MusicGameStartReq.PARSER;
        }
        
        @Override
        public Parser<MusicGameStartReq> getParserForType() {
            return MusicGameStartReq.PARSER;
        }
        
        @Override
        public MusicGameStartReq getDefaultInstanceForType() {
            return MusicGameStartReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new MusicGameStartReq();
            PARSER = new AbstractParser<MusicGameStartReq>() {
                @Override
                public MusicGameStartReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new MusicGameStartReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MusicGameStartReqOrBuilder
        {
            private int musicBasicId_;
            private boolean unk2700IOKPIKJDEHG_;
            private long musicShareId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return MusicGameStartReqOuterClass.internal_static_MusicGameStartReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return MusicGameStartReqOuterClass.internal_static_MusicGameStartReq_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicGameStartReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (MusicGameStartReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.musicBasicId_ = 0;
                this.unk2700IOKPIKJDEHG_ = false;
                this.musicShareId_ = 0L;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return MusicGameStartReqOuterClass.internal_static_MusicGameStartReq_descriptor;
            }
            
            @Override
            public MusicGameStartReq getDefaultInstanceForType() {
                return MusicGameStartReq.getDefaultInstance();
            }
            
            @Override
            public MusicGameStartReq build() {
                final MusicGameStartReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public MusicGameStartReq buildPartial() {
                final MusicGameStartReq result = new MusicGameStartReq(this);
                result.musicBasicId_ = this.musicBasicId_;
                result.unk2700IOKPIKJDEHG_ = this.unk2700IOKPIKJDEHG_;
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
                if (other instanceof MusicGameStartReq) {
                    return this.mergeFrom((MusicGameStartReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final MusicGameStartReq other) {
                if (other == MusicGameStartReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getMusicBasicId() != 0) {
                    this.setMusicBasicId(other.getMusicBasicId());
                }
                if (other.getUnk2700IOKPIKJDEHG()) {
                    this.setUnk2700IOKPIKJDEHG(other.getUnk2700IOKPIKJDEHG());
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
                MusicGameStartReq parsedMessage = null;
                try {
                    parsedMessage = MusicGameStartReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (MusicGameStartReq)e.getUnfinishedMessage();
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
            public boolean getUnk2700IOKPIKJDEHG() {
                return this.unk2700IOKPIKJDEHG_;
            }
            
            public Builder setUnk2700IOKPIKJDEHG(final boolean value) {
                this.unk2700IOKPIKJDEHG_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700IOKPIKJDEHG() {
                this.unk2700IOKPIKJDEHG_ = false;
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
    
    public interface MusicGameStartReqOrBuilder extends MessageOrBuilder
    {
        int getMusicBasicId();
        
        boolean getUnk2700IOKPIKJDEHG();
        
        long getMusicShareId();
    }
}
