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

public final class MusicGameStartRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_MusicGameStartRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MusicGameStartRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private MusicGameStartRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MusicGameStartRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0017MusicGameStartRsp.proto\"T\n\u0011MusicGameStartRsp\u0012\u0016\n\u000emusic_basic_id\u0018\u0004 \u0001(\r\u0012\u000f\n\u0007retcode\u0018\u0001 \u0001(\u0005\u0012\u0016\n\u000emusic_share_id\u0018\u000f \u0001(\u0004B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MusicGameStartRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_MusicGameStartRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MusicGameStartRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MusicGameStartRspOuterClass.internal_static_MusicGameStartRsp_descriptor, new String[] { "MusicBasicId", "Retcode", "MusicShareId" });
    }
    
    public static final class MusicGameStartRsp extends GeneratedMessageV3 implements MusicGameStartRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int MUSIC_BASIC_ID_FIELD_NUMBER = 4;
        private int musicBasicId_;
        public static final int RETCODE_FIELD_NUMBER = 1;
        private int retcode_;
        public static final int MUSIC_SHARE_ID_FIELD_NUMBER = 15;
        private long musicShareId_;
        private byte memoizedIsInitialized;
        private static final MusicGameStartRsp DEFAULT_INSTANCE;
        private static final Parser<MusicGameStartRsp> PARSER;
        
        private MusicGameStartRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private MusicGameStartRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new MusicGameStartRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private MusicGameStartRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 32: {
                            this.musicBasicId_ = input.readUInt32();
                            continue;
                        }
                        case 120: {
                            this.musicShareId_ = input.readUInt64();
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
            return MusicGameStartRspOuterClass.internal_static_MusicGameStartRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MusicGameStartRspOuterClass.internal_static_MusicGameStartRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicGameStartRsp.class, Builder.class);
        }
        
        @Override
        public int getMusicBasicId() {
            return this.musicBasicId_;
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
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
            if (this.retcode_ != 0) {
                output.writeInt32(1, this.retcode_);
            }
            if (this.musicBasicId_ != 0) {
                output.writeUInt32(4, this.musicBasicId_);
            }
            if (this.musicShareId_ != 0L) {
                output.writeUInt64(15, this.musicShareId_);
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
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(1, this.retcode_);
            }
            if (this.musicBasicId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.musicBasicId_);
            }
            if (this.musicShareId_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(15, this.musicShareId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MusicGameStartRsp)) {
                return super.equals(obj);
            }
            final MusicGameStartRsp other = (MusicGameStartRsp)obj;
            return this.getMusicBasicId() == other.getMusicBasicId() && this.getRetcode() == other.getRetcode() && this.getMusicShareId() == other.getMusicShareId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getMusicBasicId();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 15;
            hash = 53 * hash + Internal.hashLong(this.getMusicShareId());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static MusicGameStartRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return MusicGameStartRsp.PARSER.parseFrom(data);
        }
        
        public static MusicGameStartRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameStartRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameStartRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return MusicGameStartRsp.PARSER.parseFrom(data);
        }
        
        public static MusicGameStartRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameStartRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameStartRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return MusicGameStartRsp.PARSER.parseFrom(data);
        }
        
        public static MusicGameStartRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameStartRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameStartRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameStartRsp.PARSER, input);
        }
        
        public static MusicGameStartRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameStartRsp.PARSER, input, extensionRegistry);
        }
        
        public static MusicGameStartRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MusicGameStartRsp.PARSER, input);
        }
        
        public static MusicGameStartRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MusicGameStartRsp.PARSER, input, extensionRegistry);
        }
        
        public static MusicGameStartRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameStartRsp.PARSER, input);
        }
        
        public static MusicGameStartRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameStartRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return MusicGameStartRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final MusicGameStartRsp prototype) {
            return MusicGameStartRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == MusicGameStartRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static MusicGameStartRsp getDefaultInstance() {
            return MusicGameStartRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<MusicGameStartRsp> parser() {
            return MusicGameStartRsp.PARSER;
        }
        
        @Override
        public Parser<MusicGameStartRsp> getParserForType() {
            return MusicGameStartRsp.PARSER;
        }
        
        @Override
        public MusicGameStartRsp getDefaultInstanceForType() {
            return MusicGameStartRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new MusicGameStartRsp();
            PARSER = new AbstractParser<MusicGameStartRsp>() {
                @Override
                public MusicGameStartRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new MusicGameStartRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MusicGameStartRspOrBuilder
        {
            private int musicBasicId_;
            private int retcode_;
            private long musicShareId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return MusicGameStartRspOuterClass.internal_static_MusicGameStartRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return MusicGameStartRspOuterClass.internal_static_MusicGameStartRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicGameStartRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (MusicGameStartRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.musicBasicId_ = 0;
                this.retcode_ = 0;
                this.musicShareId_ = 0L;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return MusicGameStartRspOuterClass.internal_static_MusicGameStartRsp_descriptor;
            }
            
            @Override
            public MusicGameStartRsp getDefaultInstanceForType() {
                return MusicGameStartRsp.getDefaultInstance();
            }
            
            @Override
            public MusicGameStartRsp build() {
                final MusicGameStartRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public MusicGameStartRsp buildPartial() {
                final MusicGameStartRsp result = new MusicGameStartRsp(this);
                result.musicBasicId_ = this.musicBasicId_;
                result.retcode_ = this.retcode_;
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
                if (other instanceof MusicGameStartRsp) {
                    return this.mergeFrom((MusicGameStartRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final MusicGameStartRsp other) {
                if (other == MusicGameStartRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getMusicBasicId() != 0) {
                    this.setMusicBasicId(other.getMusicBasicId());
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
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
                MusicGameStartRsp parsedMessage = null;
                try {
                    parsedMessage = MusicGameStartRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (MusicGameStartRsp)e.getUnfinishedMessage();
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
    
    public interface MusicGameStartRspOrBuilder extends MessageOrBuilder
    {
        int getMusicBasicId();
        
        int getRetcode();
        
        long getMusicShareId();
    }
}
