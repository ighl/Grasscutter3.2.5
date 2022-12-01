// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Internal;
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

public final class ChapterStateNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_ChapterStateNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ChapterStateNotify_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_ChapterStateNotify_NeedPlayerLevel_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ChapterStateNotify_NeedPlayerLevel_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_ChapterStateNotify_NeedBeginTime_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ChapterStateNotify_NeedBeginTime_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ChapterStateNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ChapterStateNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0018ChapterStateNotify.proto\u001a\u0012ChapterState.proto\"\u00d4\u0002\n\u0012ChapterStateNotify\u0012$\n\rchapter_state\u0018\t \u0001(\u000e2\r.ChapterState\u0012>\n\u0011need_player_level\u0018\n \u0001(\u000b2#.ChapterStateNotify.NeedPlayerLevel\u0012:\n\u000fneed_begin_time\u0018\u0001 \u0001(\u000b2!.ChapterStateNotify.NeedBeginTime\u0012\u0012\n\nchapter_id\u0018\u0002 \u0001(\r\u001aE\n\u000fNeedPlayerLevel\u0012\u0010\n\bis_limit\u0018\u0002 \u0001(\b\u0012 \n\u0018config_need_player_level\u0018\u000b \u0001(\r\u001aA\n\rNeedBeginTime\u0012\u001e\n\u0016config_need_begin_time\u0018\u0003 \u0001(\r\u0012\u0010\n\bis_limit\u0018\u0007 \u0001(\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ChapterStateNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ChapterStateOuterClass.getDescriptor() });
        internal_static_ChapterStateNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ChapterStateNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ChapterStateNotifyOuterClass.internal_static_ChapterStateNotify_descriptor, new String[] { "ChapterState", "NeedPlayerLevel", "NeedBeginTime", "ChapterId" });
        internal_static_ChapterStateNotify_NeedPlayerLevel_descriptor = ChapterStateNotifyOuterClass.internal_static_ChapterStateNotify_descriptor.getNestedTypes().get(0);
        internal_static_ChapterStateNotify_NeedPlayerLevel_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ChapterStateNotifyOuterClass.internal_static_ChapterStateNotify_NeedPlayerLevel_descriptor, new String[] { "IsLimit", "ConfigNeedPlayerLevel" });
        internal_static_ChapterStateNotify_NeedBeginTime_descriptor = ChapterStateNotifyOuterClass.internal_static_ChapterStateNotify_descriptor.getNestedTypes().get(1);
        internal_static_ChapterStateNotify_NeedBeginTime_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ChapterStateNotifyOuterClass.internal_static_ChapterStateNotify_NeedBeginTime_descriptor, new String[] { "ConfigNeedBeginTime", "IsLimit" });
        ChapterStateOuterClass.getDescriptor();
    }
    
    public static final class ChapterStateNotify extends GeneratedMessageV3 implements ChapterStateNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int CHAPTER_STATE_FIELD_NUMBER = 9;
        private int chapterState_;
        public static final int NEED_PLAYER_LEVEL_FIELD_NUMBER = 10;
        private NeedPlayerLevel needPlayerLevel_;
        public static final int NEED_BEGIN_TIME_FIELD_NUMBER = 1;
        private NeedBeginTime needBeginTime_;
        public static final int CHAPTER_ID_FIELD_NUMBER = 2;
        private int chapterId_;
        private byte memoizedIsInitialized;
        private static final ChapterStateNotify DEFAULT_INSTANCE;
        private static final Parser<ChapterStateNotify> PARSER;
        
        private ChapterStateNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private ChapterStateNotify() {
            this.memoizedIsInitialized = -1;
            this.chapterState_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ChapterStateNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ChapterStateNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            NeedBeginTime.Builder subBuilder = null;
                            if (this.needBeginTime_ != null) {
                                subBuilder = this.needBeginTime_.toBuilder();
                            }
                            this.needBeginTime_ = input.readMessage(NeedBeginTime.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.needBeginTime_);
                                this.needBeginTime_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 16: {
                            this.chapterId_ = input.readUInt32();
                            continue;
                        }
                        case 72: {
                            final int rawValue = input.readEnum();
                            this.chapterState_ = rawValue;
                            continue;
                        }
                        case 82: {
                            NeedPlayerLevel.Builder subBuilder2 = null;
                            if (this.needPlayerLevel_ != null) {
                                subBuilder2 = this.needPlayerLevel_.toBuilder();
                            }
                            this.needPlayerLevel_ = input.readMessage(NeedPlayerLevel.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom(this.needPlayerLevel_);
                                this.needPlayerLevel_ = subBuilder2.buildPartial();
                                continue;
                            }
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
            return ChapterStateNotifyOuterClass.internal_static_ChapterStateNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ChapterStateNotifyOuterClass.internal_static_ChapterStateNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(ChapterStateNotify.class, Builder.class);
        }
        
        @Override
        public int getChapterStateValue() {
            return this.chapterState_;
        }
        
        @Override
        public ChapterStateOuterClass.ChapterState getChapterState() {
            final ChapterStateOuterClass.ChapterState result = ChapterStateOuterClass.ChapterState.valueOf(this.chapterState_);
            return (result == null) ? ChapterStateOuterClass.ChapterState.UNRECOGNIZED : result;
        }
        
        @Override
        public boolean hasNeedPlayerLevel() {
            return this.needPlayerLevel_ != null;
        }
        
        @Override
        public NeedPlayerLevel getNeedPlayerLevel() {
            return (this.needPlayerLevel_ == null) ? NeedPlayerLevel.getDefaultInstance() : this.needPlayerLevel_;
        }
        
        @Override
        public NeedPlayerLevelOrBuilder getNeedPlayerLevelOrBuilder() {
            return this.getNeedPlayerLevel();
        }
        
        @Override
        public boolean hasNeedBeginTime() {
            return this.needBeginTime_ != null;
        }
        
        @Override
        public NeedBeginTime getNeedBeginTime() {
            return (this.needBeginTime_ == null) ? NeedBeginTime.getDefaultInstance() : this.needBeginTime_;
        }
        
        @Override
        public NeedBeginTimeOrBuilder getNeedBeginTimeOrBuilder() {
            return this.getNeedBeginTime();
        }
        
        @Override
        public int getChapterId() {
            return this.chapterId_;
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
            if (this.needBeginTime_ != null) {
                output.writeMessage(1, this.getNeedBeginTime());
            }
            if (this.chapterId_ != 0) {
                output.writeUInt32(2, this.chapterId_);
            }
            if (this.chapterState_ != ChapterStateOuterClass.ChapterState.CHAPTER_STATE_INVALID.getNumber()) {
                output.writeEnum(9, this.chapterState_);
            }
            if (this.needPlayerLevel_ != null) {
                output.writeMessage(10, this.getNeedPlayerLevel());
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
            if (this.needBeginTime_ != null) {
                size += CodedOutputStream.computeMessageSize(1, this.getNeedBeginTime());
            }
            if (this.chapterId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.chapterId_);
            }
            if (this.chapterState_ != ChapterStateOuterClass.ChapterState.CHAPTER_STATE_INVALID.getNumber()) {
                size += CodedOutputStream.computeEnumSize(9, this.chapterState_);
            }
            if (this.needPlayerLevel_ != null) {
                size += CodedOutputStream.computeMessageSize(10, this.getNeedPlayerLevel());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ChapterStateNotify)) {
                return super.equals(obj);
            }
            final ChapterStateNotify other = (ChapterStateNotify)obj;
            return this.chapterState_ == other.chapterState_ && this.hasNeedPlayerLevel() == other.hasNeedPlayerLevel() && (!this.hasNeedPlayerLevel() || this.getNeedPlayerLevel().equals(other.getNeedPlayerLevel())) && this.hasNeedBeginTime() == other.hasNeedBeginTime() && (!this.hasNeedBeginTime() || this.getNeedBeginTime().equals(other.getNeedBeginTime())) && this.getChapterId() == other.getChapterId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.chapterState_;
            if (this.hasNeedPlayerLevel()) {
                hash = 37 * hash + 10;
                hash = 53 * hash + this.getNeedPlayerLevel().hashCode();
            }
            if (this.hasNeedBeginTime()) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getNeedBeginTime().hashCode();
            }
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getChapterId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ChapterStateNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ChapterStateNotify.PARSER.parseFrom(data);
        }
        
        public static ChapterStateNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ChapterStateNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ChapterStateNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ChapterStateNotify.PARSER.parseFrom(data);
        }
        
        public static ChapterStateNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ChapterStateNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ChapterStateNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ChapterStateNotify.PARSER.parseFrom(data);
        }
        
        public static ChapterStateNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ChapterStateNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ChapterStateNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ChapterStateNotify.PARSER, input);
        }
        
        public static ChapterStateNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ChapterStateNotify.PARSER, input, extensionRegistry);
        }
        
        public static ChapterStateNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ChapterStateNotify.PARSER, input);
        }
        
        public static ChapterStateNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ChapterStateNotify.PARSER, input, extensionRegistry);
        }
        
        public static ChapterStateNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ChapterStateNotify.PARSER, input);
        }
        
        public static ChapterStateNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ChapterStateNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ChapterStateNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ChapterStateNotify prototype) {
            return ChapterStateNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ChapterStateNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ChapterStateNotify getDefaultInstance() {
            return ChapterStateNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<ChapterStateNotify> parser() {
            return ChapterStateNotify.PARSER;
        }
        
        @Override
        public Parser<ChapterStateNotify> getParserForType() {
            return ChapterStateNotify.PARSER;
        }
        
        @Override
        public ChapterStateNotify getDefaultInstanceForType() {
            return ChapterStateNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ChapterStateNotify();
            PARSER = new AbstractParser<ChapterStateNotify>() {
                @Override
                public ChapterStateNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ChapterStateNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class NeedPlayerLevel extends GeneratedMessageV3 implements NeedPlayerLevelOrBuilder
        {
            private static final long serialVersionUID = 0L;
            public static final int IS_LIMIT_FIELD_NUMBER = 2;
            private boolean isLimit_;
            public static final int CONFIG_NEED_PLAYER_LEVEL_FIELD_NUMBER = 11;
            private int configNeedPlayerLevel_;
            private byte memoizedIsInitialized;
            private static final NeedPlayerLevel DEFAULT_INSTANCE;
            private static final Parser<NeedPlayerLevel> PARSER;
            
            private NeedPlayerLevel(final GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = -1;
            }
            
            private NeedPlayerLevel() {
                this.memoizedIsInitialized = -1;
            }
            
            @Override
            protected Object newInstance(final UnusedPrivateParameter unused) {
                return new NeedPlayerLevel();
            }
            
            @Override
            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }
            
            private NeedPlayerLevel(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                this.isLimit_ = input.readBool();
                                continue;
                            }
                            case 88: {
                                this.configNeedPlayerLevel_ = input.readUInt32();
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
                return ChapterStateNotifyOuterClass.internal_static_ChapterStateNotify_NeedPlayerLevel_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ChapterStateNotifyOuterClass.internal_static_ChapterStateNotify_NeedPlayerLevel_fieldAccessorTable.ensureFieldAccessorsInitialized(NeedPlayerLevel.class, Builder.class);
            }
            
            @Override
            public boolean getIsLimit() {
                return this.isLimit_;
            }
            
            @Override
            public int getConfigNeedPlayerLevel() {
                return this.configNeedPlayerLevel_;
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
                if (this.isLimit_) {
                    output.writeBool(2, this.isLimit_);
                }
                if (this.configNeedPlayerLevel_ != 0) {
                    output.writeUInt32(11, this.configNeedPlayerLevel_);
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
                if (this.isLimit_) {
                    size += CodedOutputStream.computeBoolSize(2, this.isLimit_);
                }
                if (this.configNeedPlayerLevel_ != 0) {
                    size += CodedOutputStream.computeUInt32Size(11, this.configNeedPlayerLevel_);
                }
                size += this.unknownFields.getSerializedSize();
                return this.memoizedSize = size;
            }
            
            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof NeedPlayerLevel)) {
                    return super.equals(obj);
                }
                final NeedPlayerLevel other = (NeedPlayerLevel)obj;
                return this.getIsLimit() == other.getIsLimit() && this.getConfigNeedPlayerLevel() == other.getConfigNeedPlayerLevel() && this.unknownFields.equals(other.unknownFields);
            }
            
            @Override
            public int hashCode() {
                if (this.memoizedHashCode != 0) {
                    return this.memoizedHashCode;
                }
                int hash = 41;
                hash = 19 * hash + getDescriptor().hashCode();
                hash = 37 * hash + 2;
                hash = 53 * hash + Internal.hashBoolean(this.getIsLimit());
                hash = 37 * hash + 11;
                hash = 53 * hash + this.getConfigNeedPlayerLevel();
                hash = 29 * hash + this.unknownFields.hashCode();
                return this.memoizedHashCode = hash;
            }
            
            public static NeedPlayerLevel parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
                return NeedPlayerLevel.PARSER.parseFrom(data);
            }
            
            public static NeedPlayerLevel parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return NeedPlayerLevel.PARSER.parseFrom(data, extensionRegistry);
            }
            
            public static NeedPlayerLevel parseFrom(final ByteString data) throws InvalidProtocolBufferException {
                return NeedPlayerLevel.PARSER.parseFrom(data);
            }
            
            public static NeedPlayerLevel parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return NeedPlayerLevel.PARSER.parseFrom(data, extensionRegistry);
            }
            
            public static NeedPlayerLevel parseFrom(final byte[] data) throws InvalidProtocolBufferException {
                return NeedPlayerLevel.PARSER.parseFrom(data);
            }
            
            public static NeedPlayerLevel parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return NeedPlayerLevel.PARSER.parseFrom(data, extensionRegistry);
            }
            
            public static NeedPlayerLevel parseFrom(final InputStream input) throws IOException {
                return GeneratedMessageV3.parseWithIOException(NeedPlayerLevel.PARSER, input);
            }
            
            public static NeedPlayerLevel parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageV3.parseWithIOException(NeedPlayerLevel.PARSER, input, extensionRegistry);
            }
            
            public static NeedPlayerLevel parseDelimitedFrom(final InputStream input) throws IOException {
                return GeneratedMessageV3.parseDelimitedWithIOException(NeedPlayerLevel.PARSER, input);
            }
            
            public static NeedPlayerLevel parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageV3.parseDelimitedWithIOException(NeedPlayerLevel.PARSER, input, extensionRegistry);
            }
            
            public static NeedPlayerLevel parseFrom(final CodedInputStream input) throws IOException {
                return GeneratedMessageV3.parseWithIOException(NeedPlayerLevel.PARSER, input);
            }
            
            public static NeedPlayerLevel parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageV3.parseWithIOException(NeedPlayerLevel.PARSER, input, extensionRegistry);
            }
            
            @Override
            public Builder newBuilderForType() {
                return newBuilder();
            }
            
            public static Builder newBuilder() {
                return NeedPlayerLevel.DEFAULT_INSTANCE.toBuilder();
            }
            
            public static Builder newBuilder(final NeedPlayerLevel prototype) {
                return NeedPlayerLevel.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            
            @Override
            public Builder toBuilder() {
                return (this == NeedPlayerLevel.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
            }
            
            @Override
            protected Builder newBuilderForType(final BuilderParent parent) {
                final Builder builder = new Builder(parent);
                return builder;
            }
            
            public static NeedPlayerLevel getDefaultInstance() {
                return NeedPlayerLevel.DEFAULT_INSTANCE;
            }
            
            public static Parser<NeedPlayerLevel> parser() {
                return NeedPlayerLevel.PARSER;
            }
            
            @Override
            public Parser<NeedPlayerLevel> getParserForType() {
                return NeedPlayerLevel.PARSER;
            }
            
            @Override
            public NeedPlayerLevel getDefaultInstanceForType() {
                return NeedPlayerLevel.DEFAULT_INSTANCE;
            }
            
            static {
                DEFAULT_INSTANCE = new NeedPlayerLevel();
                PARSER = new AbstractParser<NeedPlayerLevel>() {
                    @Override
                    public NeedPlayerLevel parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                        return new NeedPlayerLevel(input, extensionRegistry);
                    }
                };
            }
            
            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements NeedPlayerLevelOrBuilder
            {
                private boolean isLimit_;
                private int configNeedPlayerLevel_;
                
                public static final Descriptors.Descriptor getDescriptor() {
                    return ChapterStateNotifyOuterClass.internal_static_ChapterStateNotify_NeedPlayerLevel_descriptor;
                }
                
                @Override
                protected FieldAccessorTable internalGetFieldAccessorTable() {
                    return ChapterStateNotifyOuterClass.internal_static_ChapterStateNotify_NeedPlayerLevel_fieldAccessorTable.ensureFieldAccessorsInitialized(NeedPlayerLevel.class, Builder.class);
                }
                
                private Builder() {
                    this.maybeForceBuilderInitialization();
                }
                
                private Builder(final GeneratedMessageV3.BuilderParent parent) {
                    super(parent);
                    this.maybeForceBuilderInitialization();
                }
                
                private void maybeForceBuilderInitialization() {
                    if (NeedPlayerLevel.alwaysUseFieldBuilders) {}
                }
                
                @Override
                public Builder clear() {
                    super.clear();
                    this.isLimit_ = false;
                    this.configNeedPlayerLevel_ = 0;
                    return this;
                }
                
                @Override
                public Descriptors.Descriptor getDescriptorForType() {
                    return ChapterStateNotifyOuterClass.internal_static_ChapterStateNotify_NeedPlayerLevel_descriptor;
                }
                
                @Override
                public NeedPlayerLevel getDefaultInstanceForType() {
                    return NeedPlayerLevel.getDefaultInstance();
                }
                
                @Override
                public NeedPlayerLevel build() {
                    final NeedPlayerLevel result = this.buildPartial();
                    if (!result.isInitialized()) {
                        throw AbstractMessage.Builder.newUninitializedMessageException(result);
                    }
                    return result;
                }
                
                @Override
                public NeedPlayerLevel buildPartial() {
                    final NeedPlayerLevel result = new NeedPlayerLevel(this);
                    result.isLimit_ = this.isLimit_;
                    result.configNeedPlayerLevel_ = this.configNeedPlayerLevel_;
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
                    if (other instanceof NeedPlayerLevel) {
                        return this.mergeFrom((NeedPlayerLevel)other);
                    }
                    super.mergeFrom(other);
                    return this;
                }
                
                public Builder mergeFrom(final NeedPlayerLevel other) {
                    if (other == NeedPlayerLevel.getDefaultInstance()) {
                        return this;
                    }
                    if (other.getIsLimit()) {
                        this.setIsLimit(other.getIsLimit());
                    }
                    if (other.getConfigNeedPlayerLevel() != 0) {
                        this.setConfigNeedPlayerLevel(other.getConfigNeedPlayerLevel());
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
                    NeedPlayerLevel parsedMessage = null;
                    try {
                        parsedMessage = NeedPlayerLevel.PARSER.parsePartialFrom(input, extensionRegistry);
                    }
                    catch (InvalidProtocolBufferException e) {
                        parsedMessage = (NeedPlayerLevel)e.getUnfinishedMessage();
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
                public boolean getIsLimit() {
                    return this.isLimit_;
                }
                
                public Builder setIsLimit(final boolean value) {
                    this.isLimit_ = value;
                    this.onChanged();
                    return this;
                }
                
                public Builder clearIsLimit() {
                    this.isLimit_ = false;
                    this.onChanged();
                    return this;
                }
                
                @Override
                public int getConfigNeedPlayerLevel() {
                    return this.configNeedPlayerLevel_;
                }
                
                public Builder setConfigNeedPlayerLevel(final int value) {
                    this.configNeedPlayerLevel_ = value;
                    this.onChanged();
                    return this;
                }
                
                public Builder clearConfigNeedPlayerLevel() {
                    this.configNeedPlayerLevel_ = 0;
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
        
        public static final class NeedBeginTime extends GeneratedMessageV3 implements NeedBeginTimeOrBuilder
        {
            private static final long serialVersionUID = 0L;
            public static final int CONFIG_NEED_BEGIN_TIME_FIELD_NUMBER = 3;
            private int configNeedBeginTime_;
            public static final int IS_LIMIT_FIELD_NUMBER = 7;
            private boolean isLimit_;
            private byte memoizedIsInitialized;
            private static final NeedBeginTime DEFAULT_INSTANCE;
            private static final Parser<NeedBeginTime> PARSER;
            
            private NeedBeginTime(final GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = -1;
            }
            
            private NeedBeginTime() {
                this.memoizedIsInitialized = -1;
            }
            
            @Override
            protected Object newInstance(final UnusedPrivateParameter unused) {
                return new NeedBeginTime();
            }
            
            @Override
            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }
            
            private NeedBeginTime(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            case 24: {
                                this.configNeedBeginTime_ = input.readUInt32();
                                continue;
                            }
                            case 56: {
                                this.isLimit_ = input.readBool();
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
                return ChapterStateNotifyOuterClass.internal_static_ChapterStateNotify_NeedBeginTime_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ChapterStateNotifyOuterClass.internal_static_ChapterStateNotify_NeedBeginTime_fieldAccessorTable.ensureFieldAccessorsInitialized(NeedBeginTime.class, Builder.class);
            }
            
            @Override
            public int getConfigNeedBeginTime() {
                return this.configNeedBeginTime_;
            }
            
            @Override
            public boolean getIsLimit() {
                return this.isLimit_;
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
                if (this.configNeedBeginTime_ != 0) {
                    output.writeUInt32(3, this.configNeedBeginTime_);
                }
                if (this.isLimit_) {
                    output.writeBool(7, this.isLimit_);
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
                if (this.configNeedBeginTime_ != 0) {
                    size += CodedOutputStream.computeUInt32Size(3, this.configNeedBeginTime_);
                }
                if (this.isLimit_) {
                    size += CodedOutputStream.computeBoolSize(7, this.isLimit_);
                }
                size += this.unknownFields.getSerializedSize();
                return this.memoizedSize = size;
            }
            
            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof NeedBeginTime)) {
                    return super.equals(obj);
                }
                final NeedBeginTime other = (NeedBeginTime)obj;
                return this.getConfigNeedBeginTime() == other.getConfigNeedBeginTime() && this.getIsLimit() == other.getIsLimit() && this.unknownFields.equals(other.unknownFields);
            }
            
            @Override
            public int hashCode() {
                if (this.memoizedHashCode != 0) {
                    return this.memoizedHashCode;
                }
                int hash = 41;
                hash = 19 * hash + getDescriptor().hashCode();
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getConfigNeedBeginTime();
                hash = 37 * hash + 7;
                hash = 53 * hash + Internal.hashBoolean(this.getIsLimit());
                hash = 29 * hash + this.unknownFields.hashCode();
                return this.memoizedHashCode = hash;
            }
            
            public static NeedBeginTime parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
                return NeedBeginTime.PARSER.parseFrom(data);
            }
            
            public static NeedBeginTime parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return NeedBeginTime.PARSER.parseFrom(data, extensionRegistry);
            }
            
            public static NeedBeginTime parseFrom(final ByteString data) throws InvalidProtocolBufferException {
                return NeedBeginTime.PARSER.parseFrom(data);
            }
            
            public static NeedBeginTime parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return NeedBeginTime.PARSER.parseFrom(data, extensionRegistry);
            }
            
            public static NeedBeginTime parseFrom(final byte[] data) throws InvalidProtocolBufferException {
                return NeedBeginTime.PARSER.parseFrom(data);
            }
            
            public static NeedBeginTime parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return NeedBeginTime.PARSER.parseFrom(data, extensionRegistry);
            }
            
            public static NeedBeginTime parseFrom(final InputStream input) throws IOException {
                return GeneratedMessageV3.parseWithIOException(NeedBeginTime.PARSER, input);
            }
            
            public static NeedBeginTime parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageV3.parseWithIOException(NeedBeginTime.PARSER, input, extensionRegistry);
            }
            
            public static NeedBeginTime parseDelimitedFrom(final InputStream input) throws IOException {
                return GeneratedMessageV3.parseDelimitedWithIOException(NeedBeginTime.PARSER, input);
            }
            
            public static NeedBeginTime parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageV3.parseDelimitedWithIOException(NeedBeginTime.PARSER, input, extensionRegistry);
            }
            
            public static NeedBeginTime parseFrom(final CodedInputStream input) throws IOException {
                return GeneratedMessageV3.parseWithIOException(NeedBeginTime.PARSER, input);
            }
            
            public static NeedBeginTime parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageV3.parseWithIOException(NeedBeginTime.PARSER, input, extensionRegistry);
            }
            
            @Override
            public Builder newBuilderForType() {
                return newBuilder();
            }
            
            public static Builder newBuilder() {
                return NeedBeginTime.DEFAULT_INSTANCE.toBuilder();
            }
            
            public static Builder newBuilder(final NeedBeginTime prototype) {
                return NeedBeginTime.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            
            @Override
            public Builder toBuilder() {
                return (this == NeedBeginTime.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
            }
            
            @Override
            protected Builder newBuilderForType(final BuilderParent parent) {
                final Builder builder = new Builder(parent);
                return builder;
            }
            
            public static NeedBeginTime getDefaultInstance() {
                return NeedBeginTime.DEFAULT_INSTANCE;
            }
            
            public static Parser<NeedBeginTime> parser() {
                return NeedBeginTime.PARSER;
            }
            
            @Override
            public Parser<NeedBeginTime> getParserForType() {
                return NeedBeginTime.PARSER;
            }
            
            @Override
            public NeedBeginTime getDefaultInstanceForType() {
                return NeedBeginTime.DEFAULT_INSTANCE;
            }
            
            static {
                DEFAULT_INSTANCE = new NeedBeginTime();
                PARSER = new AbstractParser<NeedBeginTime>() {
                    @Override
                    public NeedBeginTime parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                        return new NeedBeginTime(input, extensionRegistry);
                    }
                };
            }
            
            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements NeedBeginTimeOrBuilder
            {
                private int configNeedBeginTime_;
                private boolean isLimit_;
                
                public static final Descriptors.Descriptor getDescriptor() {
                    return ChapterStateNotifyOuterClass.internal_static_ChapterStateNotify_NeedBeginTime_descriptor;
                }
                
                @Override
                protected FieldAccessorTable internalGetFieldAccessorTable() {
                    return ChapterStateNotifyOuterClass.internal_static_ChapterStateNotify_NeedBeginTime_fieldAccessorTable.ensureFieldAccessorsInitialized(NeedBeginTime.class, Builder.class);
                }
                
                private Builder() {
                    this.maybeForceBuilderInitialization();
                }
                
                private Builder(final GeneratedMessageV3.BuilderParent parent) {
                    super(parent);
                    this.maybeForceBuilderInitialization();
                }
                
                private void maybeForceBuilderInitialization() {
                    if (NeedBeginTime.alwaysUseFieldBuilders) {}
                }
                
                @Override
                public Builder clear() {
                    super.clear();
                    this.configNeedBeginTime_ = 0;
                    this.isLimit_ = false;
                    return this;
                }
                
                @Override
                public Descriptors.Descriptor getDescriptorForType() {
                    return ChapterStateNotifyOuterClass.internal_static_ChapterStateNotify_NeedBeginTime_descriptor;
                }
                
                @Override
                public NeedBeginTime getDefaultInstanceForType() {
                    return NeedBeginTime.getDefaultInstance();
                }
                
                @Override
                public NeedBeginTime build() {
                    final NeedBeginTime result = this.buildPartial();
                    if (!result.isInitialized()) {
                        throw AbstractMessage.Builder.newUninitializedMessageException(result);
                    }
                    return result;
                }
                
                @Override
                public NeedBeginTime buildPartial() {
                    final NeedBeginTime result = new NeedBeginTime(this);
                    result.configNeedBeginTime_ = this.configNeedBeginTime_;
                    result.isLimit_ = this.isLimit_;
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
                    if (other instanceof NeedBeginTime) {
                        return this.mergeFrom((NeedBeginTime)other);
                    }
                    super.mergeFrom(other);
                    return this;
                }
                
                public Builder mergeFrom(final NeedBeginTime other) {
                    if (other == NeedBeginTime.getDefaultInstance()) {
                        return this;
                    }
                    if (other.getConfigNeedBeginTime() != 0) {
                        this.setConfigNeedBeginTime(other.getConfigNeedBeginTime());
                    }
                    if (other.getIsLimit()) {
                        this.setIsLimit(other.getIsLimit());
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
                    NeedBeginTime parsedMessage = null;
                    try {
                        parsedMessage = NeedBeginTime.PARSER.parsePartialFrom(input, extensionRegistry);
                    }
                    catch (InvalidProtocolBufferException e) {
                        parsedMessage = (NeedBeginTime)e.getUnfinishedMessage();
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
                public int getConfigNeedBeginTime() {
                    return this.configNeedBeginTime_;
                }
                
                public Builder setConfigNeedBeginTime(final int value) {
                    this.configNeedBeginTime_ = value;
                    this.onChanged();
                    return this;
                }
                
                public Builder clearConfigNeedBeginTime() {
                    this.configNeedBeginTime_ = 0;
                    this.onChanged();
                    return this;
                }
                
                @Override
                public boolean getIsLimit() {
                    return this.isLimit_;
                }
                
                public Builder setIsLimit(final boolean value) {
                    this.isLimit_ = value;
                    this.onChanged();
                    return this;
                }
                
                public Builder clearIsLimit() {
                    this.isLimit_ = false;
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
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ChapterStateNotifyOrBuilder
        {
            private int chapterState_;
            private NeedPlayerLevel needPlayerLevel_;
            private SingleFieldBuilderV3<NeedPlayerLevel, NeedPlayerLevel.Builder, NeedPlayerLevelOrBuilder> needPlayerLevelBuilder_;
            private NeedBeginTime needBeginTime_;
            private SingleFieldBuilderV3<NeedBeginTime, NeedBeginTime.Builder, NeedBeginTimeOrBuilder> needBeginTimeBuilder_;
            private int chapterId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ChapterStateNotifyOuterClass.internal_static_ChapterStateNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ChapterStateNotifyOuterClass.internal_static_ChapterStateNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(ChapterStateNotify.class, Builder.class);
            }
            
            private Builder() {
                this.chapterState_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.chapterState_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ChapterStateNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.chapterState_ = 0;
                if (this.needPlayerLevelBuilder_ == null) {
                    this.needPlayerLevel_ = null;
                }
                else {
                    this.needPlayerLevel_ = null;
                    this.needPlayerLevelBuilder_ = null;
                }
                if (this.needBeginTimeBuilder_ == null) {
                    this.needBeginTime_ = null;
                }
                else {
                    this.needBeginTime_ = null;
                    this.needBeginTimeBuilder_ = null;
                }
                this.chapterId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ChapterStateNotifyOuterClass.internal_static_ChapterStateNotify_descriptor;
            }
            
            @Override
            public ChapterStateNotify getDefaultInstanceForType() {
                return ChapterStateNotify.getDefaultInstance();
            }
            
            @Override
            public ChapterStateNotify build() {
                final ChapterStateNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ChapterStateNotify buildPartial() {
                final ChapterStateNotify result = new ChapterStateNotify(this);
                result.chapterState_ = this.chapterState_;
                if (this.needPlayerLevelBuilder_ == null) {
                    result.needPlayerLevel_ = this.needPlayerLevel_;
                }
                else {
                    result.needPlayerLevel_ = this.needPlayerLevelBuilder_.build();
                }
                if (this.needBeginTimeBuilder_ == null) {
                    result.needBeginTime_ = this.needBeginTime_;
                }
                else {
                    result.needBeginTime_ = this.needBeginTimeBuilder_.build();
                }
                result.chapterId_ = this.chapterId_;
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
                if (other instanceof ChapterStateNotify) {
                    return this.mergeFrom((ChapterStateNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ChapterStateNotify other) {
                if (other == ChapterStateNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.chapterState_ != 0) {
                    this.setChapterStateValue(other.getChapterStateValue());
                }
                if (other.hasNeedPlayerLevel()) {
                    this.mergeNeedPlayerLevel(other.getNeedPlayerLevel());
                }
                if (other.hasNeedBeginTime()) {
                    this.mergeNeedBeginTime(other.getNeedBeginTime());
                }
                if (other.getChapterId() != 0) {
                    this.setChapterId(other.getChapterId());
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
                ChapterStateNotify parsedMessage = null;
                try {
                    parsedMessage = ChapterStateNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ChapterStateNotify)e.getUnfinishedMessage();
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
            public int getChapterStateValue() {
                return this.chapterState_;
            }
            
            public Builder setChapterStateValue(final int value) {
                this.chapterState_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public ChapterStateOuterClass.ChapterState getChapterState() {
                final ChapterStateOuterClass.ChapterState result = ChapterStateOuterClass.ChapterState.valueOf(this.chapterState_);
                return (result == null) ? ChapterStateOuterClass.ChapterState.UNRECOGNIZED : result;
            }
            
            public Builder setChapterState(final ChapterStateOuterClass.ChapterState value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.chapterState_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearChapterState() {
                this.chapterState_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasNeedPlayerLevel() {
                return this.needPlayerLevelBuilder_ != null || this.needPlayerLevel_ != null;
            }
            
            @Override
            public NeedPlayerLevel getNeedPlayerLevel() {
                if (this.needPlayerLevelBuilder_ == null) {
                    return (this.needPlayerLevel_ == null) ? NeedPlayerLevel.getDefaultInstance() : this.needPlayerLevel_;
                }
                return this.needPlayerLevelBuilder_.getMessage();
            }
            
            public Builder setNeedPlayerLevel(final NeedPlayerLevel value) {
                if (this.needPlayerLevelBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.needPlayerLevel_ = value;
                    this.onChanged();
                }
                else {
                    this.needPlayerLevelBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setNeedPlayerLevel(final NeedPlayerLevel.Builder builderForValue) {
                if (this.needPlayerLevelBuilder_ == null) {
                    this.needPlayerLevel_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.needPlayerLevelBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeNeedPlayerLevel(final NeedPlayerLevel value) {
                if (this.needPlayerLevelBuilder_ == null) {
                    if (this.needPlayerLevel_ != null) {
                        this.needPlayerLevel_ = NeedPlayerLevel.newBuilder(this.needPlayerLevel_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.needPlayerLevel_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.needPlayerLevelBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearNeedPlayerLevel() {
                if (this.needPlayerLevelBuilder_ == null) {
                    this.needPlayerLevel_ = null;
                    this.onChanged();
                }
                else {
                    this.needPlayerLevel_ = null;
                    this.needPlayerLevelBuilder_ = null;
                }
                return this;
            }
            
            public NeedPlayerLevel.Builder getNeedPlayerLevelBuilder() {
                this.onChanged();
                return this.getNeedPlayerLevelFieldBuilder().getBuilder();
            }
            
            @Override
            public NeedPlayerLevelOrBuilder getNeedPlayerLevelOrBuilder() {
                if (this.needPlayerLevelBuilder_ != null) {
                    return this.needPlayerLevelBuilder_.getMessageOrBuilder();
                }
                return (this.needPlayerLevel_ == null) ? NeedPlayerLevel.getDefaultInstance() : this.needPlayerLevel_;
            }
            
            private SingleFieldBuilderV3<NeedPlayerLevel, NeedPlayerLevel.Builder, NeedPlayerLevelOrBuilder> getNeedPlayerLevelFieldBuilder() {
                if (this.needPlayerLevelBuilder_ == null) {
                    this.needPlayerLevelBuilder_ = new SingleFieldBuilderV3<NeedPlayerLevel, NeedPlayerLevel.Builder, NeedPlayerLevelOrBuilder>(this.getNeedPlayerLevel(), this.getParentForChildren(), this.isClean());
                    this.needPlayerLevel_ = null;
                }
                return this.needPlayerLevelBuilder_;
            }
            
            @Override
            public boolean hasNeedBeginTime() {
                return this.needBeginTimeBuilder_ != null || this.needBeginTime_ != null;
            }
            
            @Override
            public NeedBeginTime getNeedBeginTime() {
                if (this.needBeginTimeBuilder_ == null) {
                    return (this.needBeginTime_ == null) ? NeedBeginTime.getDefaultInstance() : this.needBeginTime_;
                }
                return this.needBeginTimeBuilder_.getMessage();
            }
            
            public Builder setNeedBeginTime(final NeedBeginTime value) {
                if (this.needBeginTimeBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.needBeginTime_ = value;
                    this.onChanged();
                }
                else {
                    this.needBeginTimeBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setNeedBeginTime(final NeedBeginTime.Builder builderForValue) {
                if (this.needBeginTimeBuilder_ == null) {
                    this.needBeginTime_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.needBeginTimeBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeNeedBeginTime(final NeedBeginTime value) {
                if (this.needBeginTimeBuilder_ == null) {
                    if (this.needBeginTime_ != null) {
                        this.needBeginTime_ = NeedBeginTime.newBuilder(this.needBeginTime_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.needBeginTime_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.needBeginTimeBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearNeedBeginTime() {
                if (this.needBeginTimeBuilder_ == null) {
                    this.needBeginTime_ = null;
                    this.onChanged();
                }
                else {
                    this.needBeginTime_ = null;
                    this.needBeginTimeBuilder_ = null;
                }
                return this;
            }
            
            public NeedBeginTime.Builder getNeedBeginTimeBuilder() {
                this.onChanged();
                return this.getNeedBeginTimeFieldBuilder().getBuilder();
            }
            
            @Override
            public NeedBeginTimeOrBuilder getNeedBeginTimeOrBuilder() {
                if (this.needBeginTimeBuilder_ != null) {
                    return this.needBeginTimeBuilder_.getMessageOrBuilder();
                }
                return (this.needBeginTime_ == null) ? NeedBeginTime.getDefaultInstance() : this.needBeginTime_;
            }
            
            private SingleFieldBuilderV3<NeedBeginTime, NeedBeginTime.Builder, NeedBeginTimeOrBuilder> getNeedBeginTimeFieldBuilder() {
                if (this.needBeginTimeBuilder_ == null) {
                    this.needBeginTimeBuilder_ = new SingleFieldBuilderV3<NeedBeginTime, NeedBeginTime.Builder, NeedBeginTimeOrBuilder>(this.getNeedBeginTime(), this.getParentForChildren(), this.isClean());
                    this.needBeginTime_ = null;
                }
                return this.needBeginTimeBuilder_;
            }
            
            @Override
            public int getChapterId() {
                return this.chapterId_;
            }
            
            public Builder setChapterId(final int value) {
                this.chapterId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearChapterId() {
                this.chapterId_ = 0;
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
        
        public interface NeedBeginTimeOrBuilder extends MessageOrBuilder
        {
            int getConfigNeedBeginTime();
            
            boolean getIsLimit();
        }
        
        public interface NeedPlayerLevelOrBuilder extends MessageOrBuilder
        {
            boolean getIsLimit();
            
            int getConfigNeedPlayerLevel();
        }
    }
    
    public interface ChapterStateNotifyOrBuilder extends MessageOrBuilder
    {
        int getChapterStateValue();
        
        ChapterStateOuterClass.ChapterState getChapterState();
        
        boolean hasNeedPlayerLevel();
        
        ChapterStateNotify.NeedPlayerLevel getNeedPlayerLevel();
        
        ChapterStateNotify.NeedPlayerLevelOrBuilder getNeedPlayerLevelOrBuilder();
        
        boolean hasNeedBeginTime();
        
        ChapterStateNotify.NeedBeginTime getNeedBeginTime();
        
        ChapterStateNotify.NeedBeginTimeOrBuilder getNeedBeginTimeOrBuilder();
        
        int getChapterId();
    }
}
